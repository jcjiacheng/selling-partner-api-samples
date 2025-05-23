/*
 * The Selling Partner API for FBA inbound operations.
 * The Selling Partner API for Fulfillment By Amazon (FBA) Inbound. The FBA Inbound API enables building inbound workflows to create, manage, and send shipments into Amazon's fulfillment network. The API has interoperability with the Send-to-Amazon user interface.
 *
 * OpenAPI spec version: 2024-03-20
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model.fbav2024;

import java.util.Objects;
import java.util.Arrays;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;

/**
 * Summary information about a shipment.
 */
@ApiModel(description = "Summary information about a shipment.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-06-05T21:26:38.822Z")
public class ShipmentSummary {
    @SerializedName("shipmentId")
    private String shipmentId = null;

    @SerializedName("status")
    private String status = null;

    public ShipmentSummary shipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
        return this;
    }

    /**
     * Identifier of a shipment. A shipment contains the boxes and units being inbounded.
     *
     * @return shipmentId
     **/
    @ApiModelProperty(required = true, value = "Identifier of a shipment. A shipment contains the boxes and units being inbounded.")
    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public ShipmentSummary status(String status) {
        this.status = status;
        return this;
    }

    /**
     * The status of a shipment. The state of the shipment will typically start in &#x60;WORKING&#x60; and transition to &#x60;READY_TO_SHIP&#x60; once required actions are complete prior to being picked up or shipped out. Can be: &#x60;ABANDONED&#x60;, &#x60;CANCELLED&#x60;, &#x60;CHECKED_IN&#x60;, &#x60;CLOSED&#x60;, &#x60;DELETED&#x60;, &#x60;DELIVERED&#x60;, &#x60;IN_TRANSIT&#x60;, &#x60;MIXED&#x60;, &#x60;READY_TO_SHIP&#x60;, &#x60;RECEIVING&#x60;, &#x60;SHIPPED&#x60;, &#x60;WORKING&#x60;.
     *
     * @return status
     **/
    @ApiModelProperty(required = true, value = "The status of a shipment. The state of the shipment will typically start in `WORKING` and transition to `READY_TO_SHIP` once required actions are complete prior to being picked up or shipped out. Can be: `ABANDONED`, `CANCELLED`, `CHECKED_IN`, `CLOSED`, `DELETED`, `DELIVERED`, `IN_TRANSIT`, `MIXED`, `READY_TO_SHIP`, `RECEIVING`, `SHIPPED`, `WORKING`.")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShipmentSummary shipmentSummary = (ShipmentSummary) o;
        return Objects.equals(this.shipmentId, shipmentSummary.shipmentId) &&
                Objects.equals(this.status, shipmentSummary.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shipmentId, status);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShipmentSummary {\n");

        sb.append("    shipmentId: ").append(toIndentedString(shipmentId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

