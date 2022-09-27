package dsa.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author hakan
 */
public class Account {

    @JsonProperty(required = true)
    @JsonFormat(pattern = "[\\da-zA-Z]{4,6}")
    private String number;
    @JsonProperty(required = true)
    private String label;
    @JsonFormat(pattern = "[\\da-zA-Z]{4,6}")
    private String numberPreviousYear;
    private List<String> sruCodes;
    private BigDecimal openingBalance;
    private BigDecimal closingBalance;
    private BigDecimal result;
    private Type type;
    @JsonFormat(pattern = "\\d{1,2}")
    private String vatCode;
    private String unit;
    @JsonProperty(required = true)
    private Boolean active;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getNumberPreviousYear() {
        return numberPreviousYear;
    }

    public void setNumberPreviousYear(String numberPreviousYear) {
        this.numberPreviousYear = numberPreviousYear;
    }

    public List<String> getSruCodes() {
        return sruCodes;
    }

    public void setSruCodes(List<String> sruCodes) {
        this.sruCodes = sruCodes;
    }

    public BigDecimal getOpeningBalance() {
        return openingBalance;
    }

    public void setOpeningBalance(BigDecimal openingBalance) {
        this.openingBalance = openingBalance;
    }

    public BigDecimal getClosingBalance() {
        return closingBalance;
    }

    public void setClosingBalance(BigDecimal closingBalance) {
        this.closingBalance = closingBalance;
    }

    public BigDecimal getResult() {
        return result;
    }

    public void setResult(BigDecimal result) {
        this.result = result;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getVatCode() {
        return vatCode;
    }

    public void setVatCode(String vatCode) {
        this.vatCode = vatCode;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public enum Type {
        ASSET, COST, LIABILITY, REVENUE, MISC
    }
}
