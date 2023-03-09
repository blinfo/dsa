package dsa.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;
import dsa.domain.io.*;
import java.time.OffsetDateTime;
import java.util.List;

/**
 *
 * @author hakan
 */
public record ActivityLogItem(
        Long index,
        @JsonProperty(required = true)
        @JsonSerialize(using = OffsetDateTimeSerializer.class)
        @JsonDeserialize(using = OffsetDateTimeDeserializer.class)
        OffsetDateTime timestamp,
        List<String> activity,
        @JsonProperty(required = true)
        String by,
        String object) implements Entity {

}
