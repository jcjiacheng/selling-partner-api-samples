package lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import io.swagger.client.api.fbav2024.FbaInboundApi;
import io.swagger.client.model.fbav2024.GenerateTransportationOptionsResponse;
import io.swagger.client.model.fbav2024.GenerateTransportationOptionsRequest;
import io.swagger.client.model.fbav2024.ShipmentTransportationConfiguration;
import io.swagger.client.model.fbav2024.PalletInput;
import io.swagger.client.model.fbav2024.WindowInput;
import lambda.utils.*;

import org.threeten.bp.OffsetDateTime;
import java.util.Collections;

/**
 * Generating transportation options for an inbound plan for Pallet (LTL/FTL) Delivery.
 */
public class GenerateTransportationOptionsLambdaHandler implements RequestHandler<GenerateTransportationInput, GenerateTransportationOptionsResponse> {

    @Override
    public GenerateTransportationOptionsResponse handleRequest(GenerateTransportationInput input, Context context) {
        // Log input
        LambdaUtils.logInput(context, input);

        try {
            // Validate Input
            ValidateInput.validateGenerateTransportationInput(input);
            // Get FBA Inbound API instance
            FbaInboundApi fbaInboundApi = ApiUtils.getFbaInboundv2024Api(input);
            // Extract the ready to ship window from the input
            OffsetDateTime startDate = OffsetDateTime.parse(input.getReadyToShipWindow());
            // Create the request body for generating transportation options
            GenerateTransportationOptionsRequest request = getGenerateTransportationRequestBody(input, startDate);
            // Log full request
            LambdaUtils.logInput(context, request);
            // Call Generate Transportation Options API
            GenerateTransportationOptionsResponse response = fbaInboundApi.generateTransportationOptions(input.getInboundPlanId(), request);
            // Log full response
            LambdaUtils.logInput(context, response);
            return response;

        } catch (Exception e) {
            // Handle any exceptions that occur during the execution of the function.
            LambdaUtils.logException(context, e);
            return ExceptionHandling.handleException(context, e);
        }
    }

    // Generate Transportation Options Request Body
    public GenerateTransportationOptionsRequest getGenerateTransportationRequestBody(GenerateTransportationInput input, OffsetDateTime startDate) {
        // Create a GenerateTransportationOptionsRequest with the provided placement option ID,
        // ready to ship window, freight and pallet details and shipment ID
        return new GenerateTransportationOptionsRequest()
                .placementOptionId(input.getPlacementOptionId())
                .shipmentTransportationConfigurations(Collections.singletonList(
                        new ShipmentTransportationConfiguration()
                                .readyToShipWindow(new WindowInput().start(startDate))
                                .shipmentId(input.getShipmentId())
                                .contactInformation(input.getContactInformation())
                                .freightInformation(input.getFreightInformation())
                                .pallets(Collections.singletonList(
                                        new PalletInput()
                                                .dimensions(input.getPalletDimensions())
                                                .quantity(Constants.QUANTITY) // Pallet Quantity
                                                .stackability(input.getStackability())
                                                .weight(input.getPalletWeight())))));
    }
}