/*
 * Selling Partner API for Orders
 * The Selling Partner API for Orders helps you programmatically retrieve order information. These APIs let you develop fast, flexible, custom applications in areas like order synchronization, order research, and demand-based decision support tools. The Orders API supports orders that are two years old or less. Orders more than two years old will not show in the API response.  **Note:** The Orders API supports orders from 2016 and after for the JP, AU, and SG marketplaces.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model.orders;

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
 * Contains the instructions about the fulfillment like where should it be fulfilled from.
 */
@ApiModel(description = "Contains the instructions about the fulfillment like where should it be fulfilled from.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-09-10T13:35:24.271+09:00")
public class FulfillmentInstruction {
  @SerializedName("FulfillmentSupplySourceId")
  private String fulfillmentSupplySourceId = null;

  public FulfillmentInstruction fulfillmentSupplySourceId(String fulfillmentSupplySourceId) {
    this.fulfillmentSupplySourceId = fulfillmentSupplySourceId;
    return this;
  }

   /**
   * Denotes the recommended &#x60;sourceId&#x60; where the order should be fulfilled from.
   * @return fulfillmentSupplySourceId
  **/
  @ApiModelProperty(value = "Denotes the recommended `sourceId` where the order should be fulfilled from.")
  public String getFulfillmentSupplySourceId() {
    return fulfillmentSupplySourceId;
  }

  public void setFulfillmentSupplySourceId(String fulfillmentSupplySourceId) {
    this.fulfillmentSupplySourceId = fulfillmentSupplySourceId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FulfillmentInstruction fulfillmentInstruction = (FulfillmentInstruction) o;
    return Objects.equals(this.fulfillmentSupplySourceId, fulfillmentInstruction.fulfillmentSupplySourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentSupplySourceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfillmentInstruction {\n");
    
    sb.append("    fulfillmentSupplySourceId: ").append(toIndentedString(fulfillmentSupplySourceId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

