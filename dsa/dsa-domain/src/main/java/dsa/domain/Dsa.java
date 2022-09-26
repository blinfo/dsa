package dsa.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

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
    
}
