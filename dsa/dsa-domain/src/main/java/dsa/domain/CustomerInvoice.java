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
public class CustomerInvoice implements Entity {

    @JsonProperty(required = true)
    private String number;
    @JsonProperty(required = true)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate invoiceDate;
    @JsonProperty(required = true)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate dueDate;
    @JsonProperty(required = true)
    private BigDecimal amount;
    @JsonProperty(required = true)
    private Vat vat;
    private Exchange exchange;
    private BigDecimal serviceFee;
    private BigDecimal shipping;
    private String registeredBy;
    private List<Row> rows;
    private VoucherReference voucher;
    private String externalInvoiceNumber;
    private List<DimensionReference> dimensions;
    private List<Long> projectIds;
    private List<UUID> documentIds;
    private List<Payment> payments;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate deliveryDate;
    @JsonProperty(required = true)
    private CustomerData customer;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Vat getVat() {
        return vat;
    }

    public void setVat(Vat vat) {
        this.vat = vat;
    }

    public Exchange getExchange() {
        return exchange;
    }

    public void setExchange(Exchange exchange) {
        this.exchange = exchange;
    }

    public BigDecimal getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(BigDecimal serviceFee) {
        this.serviceFee = serviceFee;
    }

    public BigDecimal getShipping() {
        return shipping;
    }

    public void setShipping(BigDecimal shipping) {
        this.shipping = shipping;
    }

    public String getRegisteredBy() {
        return registeredBy;
    }

    public void setRegisteredBy(String registeredBy) {
        this.registeredBy = registeredBy;
    }

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

    public VoucherReference getVoucher() {
        return voucher;
    }

    public void setVoucher(VoucherReference voucher) {
        this.voucher = voucher;
    }

    public String getExternalInvoiceNumber() {
        return externalInvoiceNumber;
    }

    public void setExternalInvoiceNumber(String externalInvoiceNumber) {
        this.externalInvoiceNumber = externalInvoiceNumber;
    }

    public List<DimensionReference> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<DimensionReference> dimensions) {
        this.dimensions = dimensions;
    }

    public List<Long> getProjectIds() {
        return projectIds;
    }

    public void setProjectIds(List<Long> projectIds) {
        this.projectIds = projectIds;
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

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public CustomerData getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerData customer) {
        this.customer = customer;
    }

    public static class Vat implements Entity {

        @JsonProperty(required = true)
        @JsonFormat(pattern = "0%|6%|12%|25%|100%")
        private String rate;
        @JsonProperty(required = true)
        private BigDecimal amount;

        public String getRate() {
            return rate;
        }

        public void setRate(String rate) {
            this.rate = rate;
        }

        public BigDecimal getAmount() {
            return amount;
        }

        public void setAmount(BigDecimal amount) {
            this.amount = amount;
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
        private String account;
        private BigDecimal vatAmount;
        private List<DimensionReference> dimensions;
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

        public BigDecimal getVatAmount() {
            return vatAmount;
        }

        public void setVatAmount(BigDecimal vatAmount) {
            this.vatAmount = vatAmount;
        }

        public List<DimensionReference> getDimensions() {
            return dimensions;
        }

        public void setDimensions(List<DimensionReference> dimensions) {
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

    public static class CustomerData implements Entity {

        private String number;
        @JsonProperty(required = true)
        private String name;
        private List<CustomerAddress> addresses;
        @JsonProperty(required = true)
        private List<String> references;
        @JsonProperty(required = true)
        private String paymentTerms;
        private String corporateIdentityNumber;
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

        public List<CustomerAddress> getAddresses() {
            return addresses;
        }

        public void setAddresses(List<CustomerAddress> addresses) {
            this.addresses = addresses;
        }

        public List<String> getReferences() {
            return references;
        }

        public void setReferences(List<String> references) {
            this.references = references;
        }

        public String getPaymentTerms() {
            return paymentTerms;
        }

        public void setPaymentTerms(String paymentTerms) {
            this.paymentTerms = paymentTerms;
        }

        public String getCorporateIdentityNumber() {
            return corporateIdentityNumber;
        }

        public void setCorporateIdentityNumber(String corporateIdentityNumber) {
            this.corporateIdentityNumber = corporateIdentityNumber;
        }

        public String getVatRegistrationNumber() {
            return vatRegistrationNumber;
        }

        public void setVatRegistrationNumber(String vatRegistrationNumber) {
            this.vatRegistrationNumber = vatRegistrationNumber;
        }

    }

    public static class CustomerAddress extends Address {

        private AddressType type;
        private EInvoiceId eInvoiceid;

        public AddressType getType() {
            return type;
        }

        public void setType(AddressType type) {
            this.type = type;
        }

        public EInvoiceId geteInvoiceid() {
            return eInvoiceid;
        }

        public void seteInvoiceid(EInvoiceId eInvoiceid) {
            this.eInvoiceid = eInvoiceid;
        }

    }

    public static class EInvoiceId implements Entity {

        private EInvoiceType type;
        private String id;

        public EInvoiceType getType() {
            return type;
        }

        public void setType(EInvoiceType type) {
            this.type = type;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

    }

    public enum AddressType {
        INVOICE, DELIVERY
    }

    public enum InvoiceType {
        INVOICE, CREDIT, CASH // Fylla på med fler?
    }

    public enum EInvoiceType {
        PEPPOL, GLN // Fylla på med fler?
    }
}
