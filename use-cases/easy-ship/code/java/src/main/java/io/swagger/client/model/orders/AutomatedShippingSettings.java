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
 * Contains information regarding the Shipping Settings Automation program, such as whether the order&#39;s shipping settings were generated automatically, and what those settings are.
 */
@ApiModel(description = "Contains information regarding the Shipping Settings Automation program, such as whether the order's shipping settings were generated automatically, and what those settings are.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-09-10T13:35:24.271+09:00")
public class AutomatedShippingSettings {
  @SerializedName("HasAutomatedShippingSettings")
  private Boolean hasAutomatedShippingSettings = null;

  @SerializedName("AutomatedCarrier")
  private String automatedCarrier = null;

  @SerializedName("AutomatedShipMethod")
  private String automatedShipMethod = null;

  public AutomatedShippingSettings hasAutomatedShippingSettings(Boolean hasAutomatedShippingSettings) {
    this.hasAutomatedShippingSettings = hasAutomatedShippingSettings;
    return this;
  }

   /**
   * When true, this order has automated shipping settings generated by Amazon. This order could be identified as an SSA order.
   * @return hasAutomatedShippingSettings
  **/
  @ApiModelProperty(value = "When true, this order has automated shipping settings generated by Amazon. This order could be identified as an SSA order.")
  public Boolean isHasAutomatedShippingSettings() {
    return hasAutomatedShippingSettings;
  }

  public void setHasAutomatedShippingSettings(Boolean hasAutomatedShippingSettings) {
    this.hasAutomatedShippingSettings = hasAutomatedShippingSettings;
  }

  public AutomatedShippingSettings automatedCarrier(String automatedCarrier) {
    this.automatedCarrier = automatedCarrier;
    return this;
  }

   /**
   * Auto-generated carrier for SSA orders.
   * @return automatedCarrier
  **/
  @ApiModelProperty(value = "Auto-generated carrier for SSA orders.")
  public String getAutomatedCarrier() {
    return automatedCarrier;
  }

  public void setAutomatedCarrier(String automatedCarrier) {
    this.automatedCarrier = automatedCarrier;
  }

  public AutomatedShippingSettings automatedShipMethod(String automatedShipMethod) {
    this.automatedShipMethod = automatedShipMethod;
    return this;
  }

   /**
   * Auto-generated ship method for SSA orders.
   * @return automatedShipMethod
  **/
  @ApiModelProperty(value = "Auto-generated ship method for SSA orders.")
  public String getAutomatedShipMethod() {
    return automatedShipMethod;
  }

  public void setAutomatedShipMethod(String automatedShipMethod) {
    this.automatedShipMethod = automatedShipMethod;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutomatedShippingSettings automatedShippingSettings = (AutomatedShippingSettings) o;
    return Objects.equals(this.hasAutomatedShippingSettings, automatedShippingSettings.hasAutomatedShippingSettings) &&
        Objects.equals(this.automatedCarrier, automatedShippingSettings.automatedCarrier) &&
        Objects.equals(this.automatedShipMethod, automatedShippingSettings.automatedShipMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasAutomatedShippingSettings, automatedCarrier, automatedShipMethod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutomatedShippingSettings {\n");
    
    sb.append("    hasAutomatedShippingSettings: ").append(toIndentedString(hasAutomatedShippingSettings)).append("\n");
    sb.append("    automatedCarrier: ").append(toIndentedString(automatedCarrier)).append("\n");
    sb.append("    automatedShipMethod: ").append(toIndentedString(automatedShipMethod)).append("\n");
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

