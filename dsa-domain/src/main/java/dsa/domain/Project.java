package dsa.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;
import dsa.domain.io.*;
import java.time.LocalDate;
import java.util.*;

/**
 *
 * @author hakan
 */
public record Project(
        @JsonProperty(required = true)
        Long id,
        @JsonProperty(required = true)
        String name,
        List<String> customerNumbers,
        List<String> supplierNumbers,
        @JsonSerialize(using = LocalDateSerializer.class)
        @JsonDeserialize(using = LocalDateDeserializer.class)
        LocalDate startDate,
        @JsonSerialize(using = LocalDateSerializer.class)
        @JsonDeserialize(using = LocalDateDeserializer.class)
        LocalDate endDate,
        @JsonSerialize(using = LocalDateSerializer.class)
        @JsonDeserialize(using = LocalDateDeserializer.class)
        LocalDate closedDate,
        List<UUID> documentIds,
        List<String> notes) implements Entity {

}
