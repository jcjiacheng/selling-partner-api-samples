# Amazon Selling Partner API Samples

This repository contains sample code in various programming languages for use cases supported by the [Amazon Selling Partner API (SP-API)](https://developer-docs.amazon.com/sp-api/)

## Table of Contents
- [Amazon Selling Partner API Samples](#amazon-selling-partner-api-samples)
  - [Table of Contents](#table-of-contents)
  - [About this Repo ](#about-this-repo-)
  - [Use Cases ](#use-cases-)
  - [Learning Resources ](#learning-resources-)
  - [Additional Examples ](#additional-examples-)
  - [Security ](#security-)
  - [License ](#license-)
  - [Anonymous Metrics ](#anonymous-metrics-)

## About this Repo <a name="about"></a>
This repo is the official list of SP-API sample code. It is subdivided into sections for each use case (see ["Use Cases"](#use-cases)), which in turn include the proposed solution in different programming languages.
These examples each provide a demonstration of a well-architected, end-to-end implementation of a business use case that spans across one or more API sections. 

We welcome contributions to this repo in the form of fixes or improvements to existing content. For more information on contributing, please see the [CONTRIBUTING](CONTRIBUTING.md) guide.

This is considered an intermediate learning resource, and should typically be referenced after reading the [SP-API Documentation](https://developer-docs.amazon.com/sp-api). Please see [Learning Resources](#learning) for additional resources.

## Use Cases <a name="use-cases"></a>
| Use Case                                                         | Supported Languages      | Documented Code Snippets                                                                                                        | Vendor/Seller Availability |
|------------------------------------------------------------------|--------------------------|---------------------------------------------------------------------------------------------------------------------------------|----------------------------|
| [Notifications Sample Solution](use-cases/notifications)         | Java                     | -                                                                                                                               | Sellers and Vendors        |
|[B2B Pricing](use-cases/pricing-b2b)                              | Java                     | -                                                                                                                               | Sellers                    |
| [Data Kiosk](use-cases/data-kiosk)                               | Java / Python            | [Data Kiosk Code Snippets](https://developer-docs.amazon.com/sp-api/docs/code-samples#data-kiosk)                               | Sellers and Vendors        |
| [Easy Ship](use-cases/easy-ship)                                 | Java                     | -                                                                                                                               | Sellers                    |
| [Error Monitoring](use-cases/error-monitoring)                   | Java                     | -                                                                                                                               | Sellers and Vendors        |
| [Fulfillment Inbound v2024](use-cases/fulfillment-inbound)       | Java                     | [FBA Inbound Code Snippets](https://developer-docs.amazon.com/sp-api/docs/code-samples#fulfillment-inbound)                     | Sellers                    |
| [Fulfillment Outbound](use-cases/fulfillment-outbound)           | Java                     | [Fulfillment Outbound Code Snippets](https://developer-docs.amazon.com/sp-api/docs/code-samples#fulfillment-outbound)           | Sellers                    |
| [Listings](use-cases/listings)                                   | TypeScript / JavaScript  | -                                                                                                                               | Sellers and Vendors        |
| [LWA Rotation](use-cases/lwa-rotation)                           | Java                     | [LWA Rotation Code Snippets](https://developer-docs.amazon.com/sp-api/docs/code-samples#application-management)                 | Sellers and Vendors        |
| [Merchant Fulfillment](use-cases/merchant-fulfillment)           | Java / Python            | [Merchant Fulfillment Code Snippets](https://developer-docs.amazon.com/sp-api/docs/code-samples#merchant-fulfillment-network)   | Sellers                    |
| [Pricing](use-cases/pricing)                                     | Java / Python            | [Product Pricing Code Snippets](https://developer-docs.amazon.com/sp-api/docs/code-samples#product-pricing-api-v0)              | Sellers                    |
| [Shipping](use-cases/shipping-v2)                                | Python                   | -                                                                                                                               | Sellers                    |
| [Solicitations](use-cases/solicitations)                         | C# / Python              | -                                                                                                                               | Sellers                    |
| [Vendor Direct Fulfillment](use-cases/vendor-direct-fulfillment) | C#                       | [Vendor Direct Fulfillment Code Snippets](https://developer-docs.amazon.com/sp-api/docs/code-samples#vendor-direct-fulfillment) | Vendors                    |
| [Website Authorization](use-cases/website-authorization)         | Python                   | -                                                                                                                               | Sellers and Vendors        |
| [MCP Server for Data Kiosk](use-cases/amazon-data-kiosk-mcp-server)| TypeScript             | -                                                                                                                               | Sellers and Vendors        |
| [Listing Schema Validation](use-cases/listing-schema-validation) | Java                     | -                                                                                                                               | Sellers and Vendors        |

## Learning Resources <a name="learning"></a>
* [SP-API Website](https://developer.amazonservices.com)
* [SP-API Documentation](https://developer-docs.amazon.com/sp-api)
* [SP-API Developer Support](https://developer.amazonservices.com/support)

## Security <a name="security"></a>

See [CONTRIBUTING](CONTRIBUTING.md) for more information.

## License <a name="license"></a>

This library is licensed under the MIT-0 License. See the [LICENSE](LICENSE) file.

## Anonymous Metrics <a name="anonymous-metrics"></a>

This solution collects anonymous operational metrics to help Amazon Selling Partner API team improve the quality of features of the solution. For more information, including how to disable this capability, please see the [implementation guide](METRICS_GUIDE.md).

