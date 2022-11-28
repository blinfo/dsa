package dsa.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author hakan
 */
public record DimensionItemReference(
        @JsonProperty(required = true)
        Integer type,
        @JsonProperty(required = true)
        String id) implements Entity {

}
