package dsa.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author hl
 */
public record SupplierData(
        String number,
        @JsonProperty(required = true)
        String name,
        String reference,
        Address address,
        String vatRegistrationNumber) implements Entity {

}
