package dsa.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import dsa.domain.io.OffsetDateTimeDeserializer;
import dsa.domain.io.OffsetDateTimeSerializer;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author hakan
 */
public record Document(
        @JsonProperty(required = true)
        UUID id,
        @JsonProperty(required = true)
        String originalName,
        @JsonProperty(required = true)
        String path,
        @JsonSerialize(using = OffsetDateTimeSerializer.class)
        @JsonDeserialize(using = OffsetDateTimeDeserializer.class)
        OffsetDateTime lastModified,
        String lastModifiedBy,
        @JsonProperty(required = true)
        String mediaType,
        @JsonProperty(required = true)
        String signature,
        Long size,
        List<String> notes) implements Entity {

}
