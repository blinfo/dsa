package dsa.domain;

import com.fasterxml.jackson.annotation.*;
import java.math.BigDecimal;

/**
 *
 * @author hakan
 */
public record Exchange(
        @JsonProperty(required = true)
        Currency currency,
        @JsonProperty(required = true)
        BigDecimal rate) implements Entity {

}
