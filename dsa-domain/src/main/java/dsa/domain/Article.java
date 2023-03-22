package dsa.domain;

import com.fasterxml.jackson.databind.annotation.*;
import dsa.domain.io.*;
import java.time.*;
import java.util.*;

/**
 *
 * @author hl
 */
public record Article(String number,
        List<Label> labels,
        List<Price> prices,
        String description,
        Stock stock,
        Integer vatCode,
        Type type,
        String category,
        Boolean shippingRate,
        Boolean taxDeductable,
        String url,
        Double weight,
        Double volume,
        String unit,
        String barcode,
        Double orderingPoint,
        Double orderingQuantity,
        @JsonDeserialize(using = OffsetDateTimeDeserializer.class)
        @JsonSerialize(using = OffsetDateTimeSerializer.class)
        OffsetDateTime updated,
        @JsonDeserialize(using = LocalDateDeserializer.class)
        @JsonSerialize(using = LocalDateSerializer.class)
        LocalDate deliveryDate,
        Boolean passive,
        Boolean closed,
        SupplierData supplier,
        String numberAtSupplier,
        List<DimensionItemReference> dimensions,
        List<Long> projectIds,
        List<UUID> documentIds) implements Entity {

    public static record Label(String text,
            Language language) implements Entity {

    }

    public static record Account(String number,
            AccountType type) implements Entity {

        public enum AccountType {
            ACCRUALS_AND_DEFERRALS,
            COST,
            LIABILITY,
            RETAIL,
            TIME,
            VAT;
        }
    }

    public static record Stock(String placement,
            Double accessible,
            Double physical) implements Entity {

    }

    public enum Type {
        STOCK,
        NON_STOCK,
        EXTERNAL,
        CHARGEABLE_WORK,
        NON_CHARGEABLE_WORK,
        NON_WORK,
        LEAVE;
    }
}
