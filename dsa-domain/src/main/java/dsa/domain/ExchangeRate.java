package dsa.domain;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import dsa.domain.io.*;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author hakan
 */
public record ExchangeRate(
        @JsonProperty(required = true)
        Currency currency,
        @JsonProperty(required = true)
        @JsonSerialize(using = LocalDateSerializer.class)
        @JsonDeserialize(using = LocalDateDeserializer.class)
        LocalDate date,
        @JsonProperty(required = true)
        @JsonFormat(pattern = "1|100")
        Integer unit,
        @JsonProperty(required = true)
        BigDecimal buy,
        @JsonProperty(required = true)
        BigDecimal sell) implements Entity {

}
