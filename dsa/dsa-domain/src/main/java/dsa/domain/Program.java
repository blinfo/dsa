package dsa.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 *
 * @author hakan
 */
public class Program implements Entity {

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
