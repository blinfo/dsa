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
public record CustomerInvoice(
        @JsonProperty(required = true)
        String number,
        @JsonProperty(required = true)
        @JsonSerialize(using = LocalDateSerializer.class)
        @JsonDeserialize(using = LocalDateDeserializer.class)
        LocalDate invoiceDate,
        @JsonProperty(required = true)
        @JsonSerialize(using = LocalDateSerializer.class)
        @JsonDeserialize(using = LocalDateDeserializer.class)
        LocalDate dueDate,
        @JsonProperty(required = true)
        BigDecimal amount,
        @JsonFormat(pattern = "\\d{3,}")
        String ocr,
        @JsonProperty(required = true)
        Vat vat,
        Exchange exchange,
        BigDecimal serviceFee,
        BigDecimal shipping,
        String registeredBy,
        List<Row> rows,
        Type type,
        VoucherReference voucher,
        String externalInvoiceNumber,
        List<DimensionItemReference> dimensions,
        List<Long> projectIds,
        List<UUID> documentIds,
        List<Payment> payments,
        @JsonSerialize(using = LocalDateSerializer.class)
        @JsonDeserialize(using = LocalDateDeserializer.class)
        LocalDate deliveryDate,
        @JsonProperty(required = true)
        CustomerData customer) implements Entity {

    public static record Vat(
            @JsonProperty(required = true)
            @JsonFormat(pattern = "0%|6%|12%|25%|100%")
            String rate,
            @JsonProperty(required = true)
            BigDecimal amount) implements Entity {

    }

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
            BigDecimal vatAmount,
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

    public static record CustomerData(
            String number,
            @JsonProperty(required = true)
            String name,
            List<CustomerAddress> addresses,
            @JsonProperty(required = true)
            List<String> references,
            @JsonProperty(required = true)
            String paymentTerms,
            String corporateIdentityNumber,
            String vatRegistrationNumber) implements Entity {

    }

    /**
     * Extends Address
     */
    public record CustomerAddress(
            @JsonProperty(required = true)
            String label,
            @JsonProperty(required = true)
            String name,
            @JsonProperty(required = true)
            List<dsa.domain.Address.Line> addressLines,
            @JsonProperty(required = true)
            String zip,
            @JsonProperty(required = true)
            String city,
            @JsonProperty(required = true)
            Country country,
            List<PhoneNumber> phoneNumbers,
            List<EmailAddress> emailAddresses,
            AddressType type,
            EInvoiceId eInvoiceId) implements Entity {

    }

    public enum AddressType {
        INVOICE, DELIVERY
    }

    public enum Type {
        INVOICE, CREDIT, CASH;
    }
}
