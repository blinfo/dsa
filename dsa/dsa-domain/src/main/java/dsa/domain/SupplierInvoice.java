package dsa.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import dsa.domain.io.LocalDateDeserializer;
import dsa.domain.io.LocalDateSerializer;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author hakan
 */
public class SupplierInvoice implements Entity {

    private Long number;
    private String invoiceNumber;
    @JsonFormat(pattern = "\\d{3,}")
    private String ocr;
    @JsonProperty(required = true)
    private BigDecimal amount;
    @JsonProperty(required = true)
    private SupplierData supplier;
    private List<VoucherReference> vouchers;
    private List<Row> rows;
    @JsonProperty(required = true)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate invoiceDate;
    @JsonProperty(required = true)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate dueDate;
    @JsonProperty(required = true)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate registrationDate;
    private List<UUID> documentIds;
    private List<Payment> payments;
    private List<String> notes;
    private Exchange exchange;
    private List<DimensionItemReference> dimensions;
    private List<Long> projectIds;

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getOcr() {
        return ocr;
    }

    public void setOcr(String ocr) {
        this.ocr = ocr;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public SupplierData getSupplier() {
        return supplier;
    }

    public void setSupplier(SupplierData supplier) {
        this.supplier = supplier;
    }

    public List<VoucherReference> getVouchers() {
        return vouchers;
    }

    public void setVouchers(List<VoucherReference> vouchers) {
        this.vouchers = vouchers;
    }

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

    public LocalDate getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(LocalDate invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public List<UUID> getDocumentIds() {
        return documentIds;
    }

    public void setDocumentIds(List<UUID> documentIds) {
        this.documentIds = documentIds;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public Exchange getExchange() {
        return exchange;
    }

    public void setExchange(Exchange exchange) {
        this.exchange = exchange;
    }

    public List<DimensionItemReference> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<DimensionItemReference> dimensions) {
        this.dimensions = dimensions;
    }

    public List<Long> getProjectIds() {
        return projectIds;
    }

    public void setProjectIds(List<Long> projectIds) {
        this.projectIds = projectIds;
    }

    public static class SupplierData implements Entity {

        private String number;
        @JsonProperty(required = true)
        private String name;
        private String reference;
        private Address address;
        private String vatRegistrationNumber;

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getReference() {
            return reference;
        }

        public void setReference(String reference) {
            this.reference = reference;
        }

        public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }

        public String getVatRegistrationNumber() {
            return vatRegistrationNumber;
        }

        public void setVatRegistrationNumber(String vatRegistrationNumber) {
            this.vatRegistrationNumber = vatRegistrationNumber;
        }
    }

    public static class Row implements Entity {

        @JsonProperty(required = true)
        private Integer index;
        private String article;
        private String text;
        private BigDecimal netAmount;
        private String unit;
        private Double quantity;
        @JsonFormat(pattern = "[\\da-zA-Z]{4,6}")
        private String account;
        private List<DimensionItemReference> dimensions;
        private List<Long> projectIds;

        public Integer getIndex() {
            return index;
        }

        public void setIndex(Integer index) {
            this.index = index;
        }

        public String getArticle() {
            return article;
        }

        public void setArticle(String article) {
            this.article = article;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public BigDecimal getNetAmount() {
            return netAmount;
        }

        public void setNetAmount(BigDecimal netAmount) {
            this.netAmount = netAmount;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public Double getQuantity() {
            return quantity;
        }

        public void setQuantity(Double quantity) {
            this.quantity = quantity;
        }

        public String getAccount() {
            return account;
        }

        public void setAccount(String account) {
            this.account = account;
        }

        public List<DimensionItemReference> getDimensions() {
            return dimensions;
        }

        public void setDimensions(List<DimensionItemReference> dimensions) {
            this.dimensions = dimensions;
        }

        public List<Long> getProjectIds() {
            return projectIds;
        }

        public void setProjectIds(List<Long> projectIds) {
            this.projectIds = projectIds;
        }
    }

    public static class Payment implements Entity {

        @JsonProperty(required = true)
        @JsonSerialize(using = LocalDateSerializer.class)
        @JsonDeserialize(using = LocalDateDeserializer.class)
        private LocalDate paymentDate;
        @JsonProperty(required = true)
        private BigDecimal amount;
        private Exchange exchange;
        @JsonFormat(pattern = "[\\da-zA-Z]{4,6}")
        private String account;
        private VoucherReference voucher;
        private String registeredBy;

        public LocalDate getPaymentDate() {
            return paymentDate;
        }

        public void setPaymentDate(LocalDate paymentDate) {
            this.paymentDate = paymentDate;
        }

        public BigDecimal getAmount() {
            return amount;
        }

        public void setAmount(BigDecimal amount) {
            this.amount = amount;
        }

        public Exchange getExchange() {
            return exchange;
        }

        public void setExchange(Exchange exchange) {
            this.exchange = exchange;
        }

        public String getAccount() {
            return account;
        }

        public void setAccount(String account) {
            this.account = account;
        }

        public VoucherReference getVoucher() {
            return voucher;
        }

        public void setVoucher(VoucherReference voucher) {
            this.voucher = voucher;
        }

        public String getRegisteredBy() {
            return registeredBy;
        }

        public void setRegisteredBy(String registeredBy) {
            this.registeredBy = registeredBy;
        }
    }
}
