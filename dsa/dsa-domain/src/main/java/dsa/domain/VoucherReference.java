package dsa.domain;

import com.fasterxml.jackson.annotation.*;

/**
 *
 * @author hakan
 */
public record VoucherReference(
        @JsonProperty(required = true)
        @JsonFormat(pattern = "[\\dA-Z#]{1}")
        String series,
        @JsonProperty(required = true)
        Long number,
        @JsonProperty(required = true)
        Long financialYearId) implements Entity {

}
