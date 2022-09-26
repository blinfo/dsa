package dsa.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import dsa.domain.io.LocalDateDeserializer;
import dsa.domain.io.LocalDateSerializer;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author hakan
 */
public class Voucher implements Entity {

    @JsonProperty(required = true)
    private Long number;
    @JsonProperty(required = true)
    private String text;
    @JsonProperty(required = true)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate voucherDate;
    @JsonProperty(required = true)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate registrationDate;
    @JsonProperty(required = true)
    private String registeredBy;
    @JsonProperty(required = true)
    private List<Transaction> transactions;
    private List<Long> documentIds;
    private CorrectedVoucher correctedVoucher;

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getVoucherDate() {
        return voucherDate;
    }

    public void setVoucherDate(LocalDate voucherDate) {
        this.voucherDate = voucherDate;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getRegisteredBy() {
        return registeredBy;
    }

    public void setRegisteredBy(String registeredBy) {
        this.registeredBy = registeredBy;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public List<Long> getDocumentIds() {
        return documentIds;
    }

    public void setDocumentIds(List<Long> documentIds) {
        this.documentIds = documentIds;
    }

    public CorrectedVoucher getCorrectedVoucher() {
        return correctedVoucher;
    }

    public void setCorrectedVoucher(CorrectedVoucher correctedVoucher) {
        this.correctedVoucher = correctedVoucher;
    }

    public static class Transaction implements Entity {

        @JsonProperty(required = true)
        private String accountNumber;
        @JsonProperty(required = true)
        private BigDecimal balance;
        private String text;
        @JsonSerialize(using = LocalDateSerializer.class)
        @JsonDeserialize(using = LocalDateDeserializer.class)
        private LocalDate modifiedDate;
        private Double quantity;
        private String registeredBy;
        private ModificationType modificationType;
        private List<Dimension> dimensions;

        public String getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public BigDecimal getBalance() {
            return balance;
        }

        public void setBalance(BigDecimal balance) {
            this.balance = balance;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public LocalDate getModifiedDate() {
            return modifiedDate;
        }

        public void setModifiedDate(LocalDate modifiedDate) {
            this.modifiedDate = modifiedDate;
        }

        public Double getQuantity() {
            return quantity;
        }

        public void setQuantity(Double quantity) {
            this.quantity = quantity;
        }

        public String getRegisteredBy() {
            return registeredBy;
        }

        public void setRegisteredBy(String registeredBy) {
            this.registeredBy = registeredBy;
        }

        public ModificationType getModificationType() {
            return modificationType;
        }

        public void setModificationType(ModificationType modificationType) {
            this.modificationType = modificationType;
        }

        public List<Dimension> getDimensions() {
            return dimensions;
        }

        public void setDimensions(List<Dimension> dimensions) {
            this.dimensions = dimensions;
        }

        public enum ModificationType {
            ADDED, CANCELED;
        }
    }

    public static class CorrectedVoucher implements Entity {

        @JsonProperty(required = true)
        private String series;
        @JsonProperty(required = true)
        private Long number;
        @JsonProperty(required = true)
        private Long financialYearId;

        public String getSeries() {
            return series;
        }

        public void setSeries(String series) {
            this.series = series;
        }

        public Long getNumber() {
            return number;
        }

        public void setNumber(Long number) {
            this.number = number;
        }

        public Long getFinancialYearId() {
            return financialYearId;
        }

        public void setFinancialYearId(Long financialYearId) {
            this.financialYearId = financialYearId;
        }

    }
}
