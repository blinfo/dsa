package dsa.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author hakan
 */
public record EmailAddress(
        @JsonProperty(required = true)
        String address,
        String name) implements Entity {

}
