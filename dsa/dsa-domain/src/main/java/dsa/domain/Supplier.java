package dsa.domain;

import java.util.*;

/**
 *
 * @author hl
 */
public record Supplier(String number,
        String name,
        List<Address> addresses,
        List<PhoneNumber> phoneNumbers,
        List<EmailAddress> emailAddresses,
        List<String> references,
        String corporateIdentityNumber,
        Currency currency,
        String paymentTerms,
        Boolean passive,
        Boolean vatRegistered,
        String vatRegistrationNumber,
        Bank bank,
        List<SupplierAccount> accounts, 
        List<DimensionItemReference> dimensions,
        List<Long> projectIds,
        List<UUID> documentIds) implements Entity {

    public static record SupplierAccount(String number, Type type) implements Entity {

        public enum Type {
            SUBSIDIARY_LEDGER,
            COST,
            VAT,
            ACCRUALS_AND_DEFERRALS,
            LIABILITY,
            TIME;
        }
    }
}
