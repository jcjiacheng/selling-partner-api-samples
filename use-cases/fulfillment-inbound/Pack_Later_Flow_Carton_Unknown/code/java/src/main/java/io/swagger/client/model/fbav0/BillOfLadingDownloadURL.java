/*
 * Selling Partner API for Fulfillment Inbound
 * The Selling Partner API for Fulfillment Inbound lets you create applications that create and update inbound shipments of inventory to Amazon's fulfillment network.
 *
 * OpenAPI spec version: v0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model.fbav0;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Download URL for the bill of lading.
 */
@ApiModel(description = "Download URL for the bill of lading.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-06T15:45:02.096-05:00")
public class BillOfLadingDownloadURL {
    @SerializedName("DownloadURL")
    private String downloadURL = null;

    public BillOfLadingDownloadURL downloadURL(String downloadURL) {
        this.downloadURL = downloadURL;
        return this;
    }

    /**
     * URL to download the bill of lading for the package. Note: The URL will only be valid for 15 seconds
     *
     * @return downloadURL
     **/
    @ApiModelProperty(value = "URL to download the bill of lading for the package. Note: The URL will only be valid for 15 seconds")
    public String getDownloadURL() {
        return downloadURL;
    }

    public void setDownloadURL(String downloadURL) {
        this.downloadURL = downloadURL;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BillOfLadingDownloadURL billOfLadingDownloadURL = (BillOfLadingDownloadURL) o;
        return Objects.equals(this.downloadURL, billOfLadingDownloadURL.downloadURL);
    }

    @Override
    public int hashCode() {
        return Objects.hash(downloadURL);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillOfLadingDownloadURL {\n");

        sb.append("    downloadURL: ").append(toIndentedString(downloadURL)).append("\n");
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

