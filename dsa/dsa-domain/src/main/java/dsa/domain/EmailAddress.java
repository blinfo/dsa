package dsa.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author hakan
 */
public class EmailAddress implements Entity {

    @JsonProperty(required = true)
    private String address;
    private String name;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
