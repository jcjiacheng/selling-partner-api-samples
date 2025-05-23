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
 * The carrier for the inbound shipment.
 */
@ApiModel(description = "The carrier for the inbound shipment.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-06-05T21:26:38.822Z")
public class Carrier {
    @SerializedName("alphaCode")
    private String alphaCode = null;

    @SerializedName("name")
    private String name = null;

    public Carrier alphaCode(String alphaCode) {
        this.alphaCode = alphaCode;
        return this;
    }

    /**
     * The carrier code. For example, USPS or DHLEX.
     *
     * @return alphaCode
     **/
    @ApiModelProperty(value = "The carrier code. For example, USPS or DHLEX.")
    public String getAlphaCode() {
        return alphaCode;
    }

    public void setAlphaCode(String alphaCode) {
        this.alphaCode = alphaCode;
    }

    public Carrier name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the carrier.
     *
     * @return name
     **/
    @ApiModelProperty(value = "The name of the carrier.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Carrier carrier = (Carrier) o;
        return Objects.equals(this.alphaCode, carrier.alphaCode) &&
                Objects.equals(this.name, carrier.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alphaCode, name);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Carrier {\n");

        sb.append("    alphaCode: ").append(toIndentedString(alphaCode)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

