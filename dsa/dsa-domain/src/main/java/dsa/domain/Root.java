package dsa.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author hakan
 */
public class Root implements Entity {

    @JsonProperty(required = true)
    private Dsa dsa;
    @JsonProperty(required = true)
    private Organisation organisation;

    public Dsa getDsa() {
        return dsa;
    }

    public void setDsa(Dsa dsa) {
        this.dsa = dsa;
    }

    public Organisation getOrganisation() {
        return organisation;
    }

    public void setOrganisation(Organisation organisation) {
        this.organisation = organisation;
    }

}
