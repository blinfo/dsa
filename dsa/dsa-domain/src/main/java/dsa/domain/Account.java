package dsa.domain;

import com.fasterxml.jackson.annotation.*;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author hakan
 */
public record Account(
        @JsonProperty(required = true)
        @JsonFormat(pattern = "[\\da-zA-Z]{4,6}")
        String number,
        @JsonProperty(required = true)
        String label,
        @JsonFormat(pattern = "[\\da-zA-Z]{4,6}")
        String numberPreviousYear,
        List<String> sruCodes,
        BigDecimal openingBalance,
        BigDecimal closingBalance,
        BigDecimal result,
        Type type,
        @JsonFormat(pattern = "\\d{1,2}")
        String vatCode,
        String unit,
        @JsonProperty(required = true)
        Boolean active) {

    public enum Type {
        ASSET, COST, LIABILITY, REVENUE, MISC
    }
}
