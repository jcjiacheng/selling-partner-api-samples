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
 * Information about whether or not a buyer requested cancellation.
 */
@ApiModel(description = "Information about whether or not a buyer requested cancellation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-09-10T13:35:24.271+09:00")
public class BuyerRequestedCancel {
  @SerializedName("IsBuyerRequestedCancel")
  private String isBuyerRequestedCancel = null;

  @SerializedName("BuyerCancelReason")
  private String buyerCancelReason = null;

  public BuyerRequestedCancel isBuyerRequestedCancel(String isBuyerRequestedCancel) {
    this.isBuyerRequestedCancel = isBuyerRequestedCancel;
    return this;
  }

   /**
   * Indicate whether the buyer has requested cancellation.  **Possible Values**: &#x60;true&#x60;, &#x60;false&#x60;.
   * @return isBuyerRequestedCancel
  **/
  @ApiModelProperty(value = "Indicate whether the buyer has requested cancellation.  **Possible Values**: `true`, `false`.")
  public String getIsBuyerRequestedCancel() {
    return isBuyerRequestedCancel;
  }

  public void setIsBuyerRequestedCancel(String isBuyerRequestedCancel) {
    this.isBuyerRequestedCancel = isBuyerRequestedCancel;
  }

  public BuyerRequestedCancel buyerCancelReason(String buyerCancelReason) {
    this.buyerCancelReason = buyerCancelReason;
    return this;
  }

   /**
   * The reason that the buyer requested cancellation.
   * @return buyerCancelReason
  **/
  @ApiModelProperty(value = "The reason that the buyer requested cancellation.")
  public String getBuyerCancelReason() {
    return buyerCancelReason;
  }

  public void setBuyerCancelReason(String buyerCancelReason) {
    this.buyerCancelReason = buyerCancelReason;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuyerRequestedCancel buyerRequestedCancel = (BuyerRequestedCancel) o;
    return Objects.equals(this.isBuyerRequestedCancel, buyerRequestedCancel.isBuyerRequestedCancel) &&
        Objects.equals(this.buyerCancelReason, buyerRequestedCancel.buyerCancelReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isBuyerRequestedCancel, buyerCancelReason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuyerRequestedCancel {\n");
    
    sb.append("    isBuyerRequestedCancel: ").append(toIndentedString(isBuyerRequestedCancel)).append("\n");
    sb.append("    buyerCancelReason: ").append(toIndentedString(buyerCancelReason)).append("\n");
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

