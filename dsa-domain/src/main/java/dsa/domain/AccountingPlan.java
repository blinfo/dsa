package dsa.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 *
 * @author hakan
 */
public record AccountingPlan(
        @JsonProperty(required = true)
        String label,
        @JsonProperty(required = true)
        List<Account> accounts) implements Entity {

}
