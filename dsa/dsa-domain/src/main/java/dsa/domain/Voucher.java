package dsa.domain;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import dsa.domain.io.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

/**
 *
 * @author hakan
 */
public record Voucher(
        @JsonProperty(required = true)
        Long number,
        @JsonProperty(required = true)
        String text,
        @JsonProperty(required = true)
        @JsonSerialize(using = LocalDateSerializer.class)
        @JsonDeserialize(using = LocalDateDeserializer.class)
        LocalDate voucherDate,
        @JsonProperty(required = true)
        @JsonSerialize(using = LocalDateSerializer.class)
        @JsonDeserialize(using = LocalDateDeserializer.class)
        LocalDate registrationDate,
        @JsonProperty(required = true)
        String registeredBy,
        @JsonProperty(required = true)
        List<Transaction> transactions,
        List<UUID> documentIds,
        CorrectedVoucher correctedVoucher) implements Entity {

    public static record Transaction(
            @JsonProperty(required = true)
            @JsonFormat(pattern = "[\\da-zA-Z]{4,6}")
            String accountNumber,
            @JsonProperty(required = true)
            BigDecimal balance,
            String text,
            @JsonSerialize(using = LocalDateSerializer.class)
            @JsonDeserialize(using = LocalDateDeserializer.class)
            LocalDate modifiedDate,
            Double quantity,
            String registeredBy,
            ModificationType modificationType,
            List<DimensionItemReference> dimensions) implements Entity {

        public enum ModificationType {
            ADDED, CANCELED,
        }
    }

    public static record CorrectedVoucher(
            @JsonProperty(required = true)
            String series,
            @JsonProperty(required = true)
            Long number,
            @JsonProperty(required = true)
            Long financialYearId) implements Entity {

    }
}
