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
public record SupplierInvoice(
        Long number,
        String invoiceNumber,
        @JsonFormat(pattern = "\\d{3,}")
        String ocr,
        @JsonProperty(required = true)
        BigDecimal amount,
        @JsonProperty(required = true)
        SupplierData supplier,
        List<VoucherReference> vouchers,
        List<Row> rows,
        @JsonProperty(required = true)
        @JsonSerialize(using = LocalDateSerializer.class)
        @JsonDeserialize(using = LocalDateDeserializer.class)
        LocalDate invoiceDate,
        @JsonProperty(required = true)
        @JsonSerialize(using = LocalDateSerializer.class)
        @JsonDeserialize(using = LocalDateDeserializer.class)
        LocalDate dueDate,
        @JsonProperty(required = true)
        @JsonSerialize(using = LocalDateSerializer.class)
        @JsonDeserialize(using = LocalDateDeserializer.class)
        LocalDate registrationDate,
        List<UUID> documentIds,
        List<Payment> payments,
        List<String> notes,
        Exchange exchange,
        List<DimensionItemReference> dimensions,
        List<Long> projectIds) implements Entity {

    public static record Row(
            @JsonProperty(required = true)
            Integer index,
            String article,
            String text,
            BigDecimal netAmount,
            String unit,
            Double quantity,
            @JsonFormat(pattern = "[\\da-zA-Z]{4,6}")
            String account,
            List<DimensionItemReference> dimensions,
            List<Long> projectIds) implements Entity {

    }

    public static record Payment(
            @JsonProperty(required = true)
            @JsonSerialize(using = LocalDateSerializer.class)
            @JsonDeserialize(using = LocalDateDeserializer.class)
            LocalDate paymentDate,
            @JsonProperty(required = true)
            BigDecimal amount,
            Exchange exchange,
            @JsonFormat(pattern = "[\\da-zA-Z]{4,6}")
            String account,
            VoucherReference voucher,
            String registeredBy) implements Entity {

    }
}
