package dsa.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author hakan
 */
public record Root(
        @JsonProperty(required = true)
        Dsa dsa,
        @JsonProperty(required = true)
        Organisation organisation) implements Entity {

}
