package dsa.domain;

import java.math.BigDecimal;
import java.util.*;

/**
 *
 * @author hl
 */
public record Customer(String number,
        String name,
        String department,
        List<Address> addresses,
        List<PhoneNumber> phoneNumbers,
        List<EmailAddress> emailAddresses,
        List<String> references,
        CreditLimit creditLimit,
        String paymentTerms,
        String deliveryTerms,
        String deliveryMethod,
        String corporateIdentityNumber,
        Currency currency,
        List<CustomerAccount> accounts,
        Boolean passive,
        Boolean vatRegistered,
        String vatRegistrationNumber,
        EInvoiceId eInvoiceId,
        List<DimensionItemReference> dimensions,
        List<Long> projectIds,
        List<UUID> documentIds) implements Entity {

    public static record CreditLimit(BigDecimal limit, Currency currency) implements Entity {

    }

    public static record CustomerAccount(String number, Type type) implements Entity {

        public enum Type {
            SUBSIDIARY_LEDGER, COST, SALE;
        }
    }
}
