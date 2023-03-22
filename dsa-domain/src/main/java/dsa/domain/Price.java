package dsa.domain;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.stream.Stream;

/**
 *
 * @author hl
 */
public record Price(BigDecimal amount,
        Currency currency,
        Type type,
        Integer index,
        String unit,
        String priceList) {

    public enum Type {
        RETAIL, RETAIL_INCLUDING_VAT, PURCHASE;
        public static Optional<Type> find(String text) {
            return Stream.of(values()).filter(t -> t.name().equalsIgnoreCase(text)).findFirst();
        }
    }
}
