package dsa.domain;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 *
 * @author hakan
 */
public record Bank(
        @JsonProperty(required = true)
        String name,
        @JsonProperty(required = true)
        Account account,
        @JsonProperty(required = true)
        @JsonFormat(pattern = "[A-Z]{6}([\\dA-Z]{2}|[\\dA-Z]{5})")
        String bic,
        @JsonProperty(required = true)
        @JsonFormat(pattern = "[A-Z]{2}[\\dA-Z]{13,32}")
        String iban,
        List<String> bankGiro,
        List<String> plusGiro,
        String swish) implements Entity {

    public static record Account(
            @JsonProperty(required = true)
            String accountNumber,
            @JsonProperty(required = true)
            String clearingNumber) implements Entity {

    }
}
