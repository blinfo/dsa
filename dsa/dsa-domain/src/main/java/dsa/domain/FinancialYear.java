package dsa.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;
import dsa.domain.io.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author hakan
 */
public record FinancialYear(
        @JsonProperty(required = true)
        Long id,
        @JsonProperty(required = true)
        @JsonSerialize(using = LocalDateSerializer.class)
        @JsonDeserialize(using = LocalDateDeserializer.class)
        LocalDate start,
        @JsonProperty(required = true)
        @JsonSerialize(using = LocalDateSerializer.class)
        @JsonDeserialize(using = LocalDateDeserializer.class)
        LocalDate end,
        BigDecimal preliminaryTax,
        @JsonProperty(required = true)
        BookkeepingMethod bookkeepingMethod,
        @JsonProperty(required = true)
        AccountingPlan accountingPlan,
        @JsonProperty(required = true)
        List<VoucherNumberSeries> voucherNumberSeries) implements Entity {

    public enum BookkeepingMethod {
        CASHBASED, ACCRUAL
    }
}
