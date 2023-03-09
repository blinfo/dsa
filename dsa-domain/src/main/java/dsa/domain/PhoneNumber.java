package dsa.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author hakan
 */
public record PhoneNumber(
        @JsonProperty(required = true)
        String number,
        String type,
        String name) implements Entity {

}
