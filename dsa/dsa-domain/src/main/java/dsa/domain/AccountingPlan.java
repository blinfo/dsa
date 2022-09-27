package dsa.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 *
 * @author hakan
 */
public class AccountingPlan implements Entity {

    @JsonProperty(required = true)
    private String label;
    @JsonProperty(required = true)
    private List<Account> accounts;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

}
