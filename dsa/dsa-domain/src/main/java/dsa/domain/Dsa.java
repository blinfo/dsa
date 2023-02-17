package dsa.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;
import dsa.domain.io.*;
import dsa.domain.meta.MetaData;
import java.time.OffsetDateTime;
import java.util.List;

/**
 *
 * @author hakan
 */
public record Dsa(
        @JsonProperty(required = true)
        String version,
        @JsonProperty(required = true)
        Program program,
        @JsonProperty(required = true)
        Generated generated) implements Entity {

    public static String currentVersion() {
        try {
            return MetaData.currentVersion();
        } catch (Exception ex) {
            return null;
        }
    }

    public static record Program(
            @JsonProperty(required = true)
            String name,
            @JsonProperty(required = true)
            String version,
            @JsonProperty(required = true)
            List<Long> systemDocumentation) implements Entity {

    }

    public static record Generated(
            @JsonDeserialize(using = OffsetDateTimeDeserializer.class)
            @JsonSerialize(using = OffsetDateTimeSerializer.class)
            @JsonProperty(required = true)
            OffsetDateTime timestamp,
            @JsonProperty(required = true)
            String by) implements Entity {

    }
}
