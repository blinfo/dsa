package dsa.domain;

import com.fasterxml.jackson.annotation.*;
import java.util.*;
import java.util.stream.Stream;

/**
 *
 * @author hakan
 */
public record Organisation(
        @JsonProperty(required = true)
        String name,
        @JsonProperty(required = true)
        String corporateIdentityNumber,
        Type organisationType,
        Currency currency,
        String vatNumber,
        VatPeriod vatPeriod,
        Boolean vatRegistered,
        String domicile,
        @JsonProperty(required = true)
        List<Address> addresses,
        String homepage,
        Bank bank,
        List<FinancialYear> financialYears,
        List<Dimension> dimensions,
        List<Project> projects,
        List<ExchangeRate> exchangeRates,
        List<CustomerInvoice> customerInvoices,
        List<SupplierInvoice> supplierInvoices,
        List<ActivityLogItem> activityLog,
        List<Document> documents,
        List<Integration> integrations) implements Entity {

    public enum Type {
        LIMITED_COMPANY, SOLE_PROPRIETORSHIP, PARTNERSHIP, ECONOMIC_ASSOCIATION, NON_PROFIT_ASSOCIATION, OTHER;

        public static Optional<Type> find(String text) {
            return Stream.of(values()).filter(v -> v.name().equalsIgnoreCase(text)).findFirst();
        }
    }

    public enum VatPeriod {
        MONTH_VAT, QUARTER_VAT, YEAR_VAT, VAT_LESS;
    }
}
