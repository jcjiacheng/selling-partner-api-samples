<?php
/**
 * RegulatedInformationField
 *
 * PHP version 8.3
 *
 * @category Class
 * @package  SpApi
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Selling Partner API for Orders
 *
 * Use the Orders Selling Partner API to programmatically retrieve order information. With this API, you can develop fast, flexible, and custom applications to manage order synchronization, perform order research, and create demand-based decision support tools.   _Note:_ For the JP, AU, and SG marketplaces, the Orders API supports orders from 2016 onward. For all other marketplaces, the Orders API supports orders for the last two years (orders older than this don't show up in the response).
 *
 * The version of the OpenAPI document: v0
 * Generated by: https://openapi-generator.tech
 * Generator version: 7.9.0
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace SpApi\Model\orders\v0;

use
ArrayAccess;
use SpApi\ObjectSerializer;
use SpApi\Model\ModelInterface;

/**
 * RegulatedInformationField Class Doc Comment
 *
 * @category Class
 * @description A field collected from the regulatory form.
 * @package  SpApi
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class RegulatedInformationField implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static string $openAPIModelName = 'RegulatedInformationField';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static array $openAPITypes = [
             'field_id' => 'string',
             'field_label' => 'string',
             'field_type' => 'string',
             'field_value' => 'string'    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static array $openAPIFormats = [
            'field_id' => null,
            'field_label' => null,
            'field_type' => null,
            'field_value' => null    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'field_id' => false,
        'field_label' => false,
        'field_type' => false,
        'field_value' => false
    ];

    /**
      * If a nullable field gets set to null, insert it here
      *
      * @var boolean[]
      */
    protected array $openAPINullablesSetToNull = [];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPITypes(): array
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPIFormats(): array
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of nullable properties
     *
     * @return array
     */
    protected static function openAPINullables(): array
    {
        return self::$openAPINullables;
    }

    /**
     * Array of nullable field names deliberately set to null
     *
     * @return boolean[]
     */
    private function getOpenAPINullablesSetToNull(): array
    {
        return $this->openAPINullablesSetToNull;
    }

    /**
     * Setter - Array of nullable field names deliberately set to null
     *
     * @param boolean[] $openAPINullablesSetToNull
     */
    private function setOpenAPINullablesSetToNull(array $openAPINullablesSetToNull): void
    {
        $this->openAPINullablesSetToNull = $openAPINullablesSetToNull;
    }

    /**
     * Checks if a property is nullable
     *
     * @param string $property
     * @return bool
     */
    public static function isNullable(string $property): bool
    {
        return self::openAPINullables()[$property] ?? false;
    }

    /**
     * Checks if a nullable property is set to null.
     *
     * @param string $property
     * @return bool
     */
    public function isNullableSetToNull(string $property): bool
    {
        return in_array($property, $this->getOpenAPINullablesSetToNull(), true);
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static array $attributeMap = [
        'field_id' => 'FieldId',
                'field_label' => 'FieldLabel',
                'field_type' => 'FieldType',
                'field_value' => 'FieldValue'
        
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static array $setters = [
        'field_id' => 'setFieldId',
        'field_label' => 'setFieldLabel',
        'field_type' => 'setFieldType',
        'field_value' => 'setFieldValue'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static array $getters = [
        'field_id' => 'getFieldId',
        'field_label' => 'getFieldLabel',
        'field_type' => 'getFieldType',
        'field_value' => 'getFieldValue'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap(): array
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters(): array
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters(): array
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName(): string
    {
        return self::$openAPIModelName;
    }

    public const FIELD_TYPE_TEXT = 'Text';
    public const FIELD_TYPE_FILE_ATTACHMENT = 'FileAttachment';

    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getFieldTypeAllowableValues(): array
    {
        return [
            self::FIELD_TYPE_TEXT,
            self::FIELD_TYPE_FILE_ATTACHMENT,
        ];
    }

    /**
     * Associative array for storing property values
     *
     * @var array
     */
    protected array $container = [];

    /**
     * Constructor
     *
     * @param array|null $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(?array $data = null)
    {
        $this->setIfExists('field_id', $data ?? [], null);
        $this->setIfExists('field_label', $data ?? [], null);
        $this->setIfExists('field_type', $data ?? [], null);
        $this->setIfExists('field_value', $data ?? [], null);
    }

    /**
    * Sets $this->container[$variableName] to the given data or to the given default Value; if $variableName
    * is nullable and its value is set to null in the $fields array, then mark it as "set to null" in the
    * $this->openAPINullablesSetToNull array
    *
    * @param string $variableName
    * @param array  $fields
    * @param mixed  $defaultValue
    */
    private function setIfExists(string $variableName, array $fields, $defaultValue): void
    {
        if (self::isNullable($variableName) && array_key_exists($variableName, $fields) && is_null($fields[$variableName])) {
            $this->openAPINullablesSetToNull[] = $variableName;
        }

        $this->container[$variableName] = $fields[$variableName] ?? $defaultValue;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties(): array
    {
        $invalidProperties = [];

        if ($this->container['field_id'] === null) {
            $invalidProperties[] = "'field_id' can't be null";
        }
        if ($this->container['field_label'] === null) {
            $invalidProperties[] = "'field_label' can't be null";
        }
        if ($this->container['field_type'] === null) {
            $invalidProperties[] = "'field_type' can't be null";
        }
        $allowedValues = $this->getFieldTypeAllowableValues();
        if (!is_null($this->container['field_type']) && !in_array($this->container['field_type'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value '%s' for 'field_type', must be one of '%s'",
                $this->container['field_type'],
                implode("', '", $allowedValues)
            );
        }

        if ($this->container['field_value'] === null) {
            $invalidProperties[] = "'field_value' can't be null";
        }
        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid(): bool
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets field_id
     *
     * @return string
     */
    public function getFieldId(): string
    {
        return $this->container['field_id'];
    }

    /**
     * Sets field_id
     *
     * @param string $field_id The unique identifier of the field.
     *
     * @return self
     */
    public function setFieldId(string $field_id): self
    {
        if (is_null($field_id)) {
            throw new \InvalidArgumentException('non-nullable field_id cannot be null');
        }
        $this->container['field_id'] = $field_id;

        return $this;
    }

    /**
     * Gets field_label
     *
     * @return string
     */
    public function getFieldLabel(): string
    {
        return $this->container['field_label'];
    }

    /**
     * Sets field_label
     *
     * @param string $field_label The name of the field.
     *
     * @return self
     */
    public function setFieldLabel(string $field_label): self
    {
        if (is_null($field_label)) {
            throw new \InvalidArgumentException('non-nullable field_label cannot be null');
        }
        $this->container['field_label'] = $field_label;

        return $this;
    }

    /**
     * Gets field_type
     *
     * @return string
     */
    public function getFieldType(): string
    {
        return $this->container['field_type'];
    }

    /**
     * Sets field_type
     *
     * @param string $field_type The type of field.
     *
     * @return self
     */
    public function setFieldType(string $field_type): self
    {
        if (is_null($field_type)) {
            throw new \InvalidArgumentException('non-nullable field_type cannot be null');
        }
        $allowedValues = $this->getFieldTypeAllowableValues();
        if (!in_array($field_type, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value '%s' for 'field_type', must be one of '%s'",
                    $field_type,
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['field_type'] = $field_type;

        return $this;
    }

    /**
     * Gets field_value
     *
     * @return string
     */
    public function getFieldValue(): string
    {
        return $this->container['field_value'];
    }

    /**
     * Sets field_value
     *
     * @param string $field_value The content of the field as collected in regulatory form. Note that `FileAttachment` type fields contain a URL where you can download the attachment.
     *
     * @return self
     */
    public function setFieldValue(string $field_value): self
    {
        if (is_null($field_value)) {
            throw new \InvalidArgumentException('non-nullable field_value cannot be null');
        }
        $this->container['field_value'] = $field_value;

        return $this;
    }


    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset): bool
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed|null
     */
    #[\ReturnTypeWillChange]
    public function offsetGet($offset): mixed
    {
        return $this->container[$offset] ?? null;
    }

    /**
     * Sets value based on offset.
     *
     * @param int|null $offset Offset
     * @param mixed    $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, mixed $value): void
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset): void
    {
        unset($this->container[$offset]);
    }

    /**
     * Serializes the object to a value that can be serialized natively by json_encode().
     * @link https://www.php.net/manual/en/jsonserializable.jsonserialize.php
     *
     * @return mixed Returns data which can be serialized by json_encode(), which is a value
     * of any type other than a resource.
     */
    #[\ReturnTypeWillChange]
    public function jsonSerialize(): mixed
    {
       return ObjectSerializer::sanitizeForSerialization($this);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        return json_encode(
            ObjectSerializer::sanitizeForSerialization($this),
            JSON_PRETTY_PRINT
        );
    }

    /**
     * Gets a header-safe presentation of the object
     *
     * @return string
     */
    public function toHeaderValue(): string
    {
        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


