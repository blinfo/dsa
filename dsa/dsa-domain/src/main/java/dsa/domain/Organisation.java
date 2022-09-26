package dsa.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 *
 * @author hakan
 */
public class Organisation implements Entity {

    @JsonProperty(required = true)
    private String name;
    @JsonProperty(required = true)
    private String corporateIdentityNumber;
    private Type organisationType;
    @JsonFormat(pattern = "[A-Z]{3}")
    private String currency;
    private String vatNumber;
    private VatPeriod vatPeriod;
    private Boolean vatRegistered;
    private String domicile;
    @JsonProperty(required = true)
    private List<Address> addresses;
    private String homepage;
    private Bank bank;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCorporateIdentityNumber() {
        return corporateIdentityNumber;
    }

    public void setCorporateIdentityNumber(String corporateIdentityNumber) {
        this.corporateIdentityNumber = corporateIdentityNumber;
    }

    public Type getOrganisationType() {
        return organisationType;
    }

    public void setOrganisationType(Type organisationType) {
        this.organisationType = organisationType;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    public VatPeriod getVatPeriod() {
        return vatPeriod;
    }

    public void setVatPeriod(VatPeriod vatPeriod) {
        this.vatPeriod = vatPeriod;
    }

    public Boolean getVatRegistered() {
        return vatRegistered;
    }

    public void setVatRegistered(Boolean vatRegistered) {
        this.vatRegistered = vatRegistered;
    }

    public String getDomicile() {
        return domicile;
    }

    public void setDomicile(String domicile) {
        this.domicile = domicile;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public enum Type {
        LIMITED_COMPANY, SOLE_PROPRIETORSHIP, OTHER
    }

    public enum VatPeriod {
        MONTH_VAT, QUARTER_VAT, YEAR_VAT
    }
}
