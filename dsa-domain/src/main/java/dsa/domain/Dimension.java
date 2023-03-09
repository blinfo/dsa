package dsa.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 *
 * @author hakan
 */
public record Dimension(
        @JsonProperty(required = true)
        Long id,
        @JsonProperty(required = true)
        String name,
        @JsonProperty(required = true)
        List<Item> items) implements Entity {

    public static record Item(
            @JsonProperty(required = true)
            String id,
            @JsonProperty(required = true)
            String name, List<String> notes) implements Entity {

    }
}
