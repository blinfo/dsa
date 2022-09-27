package dsa.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import dsa.domain.io.OffsetDateTimeDeserializer;
import dsa.domain.io.OffsetDateTimeSerializer;
import java.time.OffsetDateTime;
import java.util.List;

/**
 *
 * @author hakan
 */
public class Dsa implements Entity {

    @JsonProperty(required = true)
    private String version;
    @JsonProperty(required = true)
    private Program program;
    @JsonProperty(required = true)
    private Generated generated;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public Generated getGenerated() {
        return generated;
    }

    public void setGenerated(Generated generated) {
        this.generated = generated;
    }

    public static class Program implements Entity {

        @JsonProperty(required = true)
        private String name;
        @JsonProperty(required = true)
        private String version;
        @JsonProperty(required = true)
        private List<Long> systemDocumentation;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public List<Long> getSystemDocumentation() {
            return systemDocumentation;
        }

        public void setSystemDocumentation(List<Long> systemDocumentation) {
            this.systemDocumentation = systemDocumentation;
        }
    }

    public static class Generated implements Entity {

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
}
