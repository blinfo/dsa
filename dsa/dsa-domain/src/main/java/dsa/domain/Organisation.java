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
    private List<FinancialYear> financialYears;
    private List<Dimension> dimensions;
    private List<Project> projects;
    private List<ExchangeRate> exchangeRates;
    private List<CustomerInvoice> customerInvoices;
    private List<SupplierInvoice> supplierInvoices;
    private List<ActivityLogItem> activityLog;
    private List<Document> documents;
    private List<Integration> integrations;

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

    public List<FinancialYear> getFinancialYears() {
        return financialYears;
    }

    public void setFinancialYears(List<FinancialYear> financialYears) {
        this.financialYears = financialYears;
    }

    public List<Dimension> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<Dimension> dimensions) {
        this.dimensions = dimensions;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public List<ExchangeRate> getExchangeRates() {
        return exchangeRates;
    }

    public void setExchangeRates(List<ExchangeRate> exchangeRates) {
        this.exchangeRates = exchangeRates;
    }

    public List<CustomerInvoice> getCustomerInvoices() {
        return customerInvoices;
    }

    public void setCustomerInvoices(List<CustomerInvoice> customerInvoices) {
        this.customerInvoices = customerInvoices;
    }

    public List<SupplierInvoice> getSupplierInvoices() {
        return supplierInvoices;
    }

    public void setSupplierInvoices(List<SupplierInvoice> supplierInvoices) {
        this.supplierInvoices = supplierInvoices;
    }

    public List<ActivityLogItem> getActivityLog() {
        return activityLog;
    }

    public void setActivityLog(List<ActivityLogItem> activityLog) {
        this.activityLog = activityLog;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    public List<Integration> getIntegrations() {
        return integrations;
    }

    public void setIntegrations(List<Integration> integrations) {
        this.integrations = integrations;
    }

    public enum Type {
        LIMITED_COMPANY, SOLE_PROPRIETORSHIP, OTHER
    }

    public enum VatPeriod {
        MONTH_VAT, QUARTER_VAT, YEAR_VAT
    }
}
