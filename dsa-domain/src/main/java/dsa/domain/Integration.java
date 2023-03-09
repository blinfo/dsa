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
public record Integration(
        @JsonProperty(required = true)
        String name,
        List<EmailAddress> emailAddresses,
        String homepage,
        String technicalDocumentationUri,
        List<UUID> documentIds,
        @JsonProperty(required = true)
        Access access,
        List<Scope> scopes,
        @JsonSerialize(using = LocalDateSerializer.class)
        @JsonDeserialize(using = LocalDateDeserializer.class)
        LocalDate connected,
        List<String> notes) implements Entity {

    public static record Scope(
            @JsonProperty(required = true)
            String name,
            @JsonProperty(required = true)
            Boolean create,
            @JsonProperty(required = true)
            Boolean read,
            @JsonProperty(required = true)
            Boolean update,
            @JsonProperty(required = true)
            Boolean delete) implements Entity {

    }

    public enum Access {
        COMPLETE, READ_ONLY, WRITE_ONLY, READ_WRITE, SCOPED
    }
}
