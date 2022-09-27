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
public class FinancialYear implements Entity {

    @JsonProperty(required = true)
    private Long id;
    @JsonProperty(required = true)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate start;
    @JsonProperty(required = true)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate end;
    private BigDecimal preliminaryTax;
    @JsonProperty(required = true)
    private BookkeepingMethod bookkeepingMethod;
    @JsonProperty(required = true)
    private AccountingPlan accountingPlan;
    @JsonProperty(required = true)
    private List<VoucherNumberSeries> voucherNumberSeries;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public BigDecimal getPreliminaryTax() {
        return preliminaryTax;
    }

    public void setPreliminaryTax(BigDecimal preliminaryTax) {
        this.preliminaryTax = preliminaryTax;
    }

    public BookkeepingMethod getBookkeepingMethod() {
        return bookkeepingMethod;
    }

    public void setBookkeepingMethod(BookkeepingMethod bookkeepingMethod) {
        this.bookkeepingMethod = bookkeepingMethod;
    }

    public AccountingPlan getAccountingPlan() {
        return accountingPlan;
    }

    public void setAccountingPlan(AccountingPlan accountingPlan) {
        this.accountingPlan = accountingPlan;
    }

    public List<VoucherNumberSeries> getVoucherNumberSeries() {
        return voucherNumberSeries;
    }

    public void setVoucherNumberSeries(List<VoucherNumberSeries> voucherNumberSeries) {
        this.voucherNumberSeries = voucherNumberSeries;
    }

    public enum BookkeepingMethod {
        CASHBASED, ACCRUAL
    }
}
