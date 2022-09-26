package dsa.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;

/**
 *
 * @author hakan
 */
public class PhoneNumber implements Entity {

    @JsonProperty(required = true)
    private String number;
    private String type;
    private String name;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
