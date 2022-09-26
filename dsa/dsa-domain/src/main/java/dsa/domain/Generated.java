package dsa.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import dsa.domain.io.OffsetDateTimeDeserializer;
import dsa.domain.io.OffsetDateTimeSerializer;
import java.time.OffsetDateTime;

/**
 *
 * @author hakan
 */
public class Generated implements Entity {

    @JsonDeserialize(using = OffsetDateTimeDeserializer.class)
    @JsonSerialize(using = OffsetDateTimeSerializer.class)
    @JsonProperty(required = true)
    private OffsetDateTime timestamp;
    @JsonProperty(required = true)
    private String by;

    public OffsetDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }
}
