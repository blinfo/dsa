package dsa.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 *
 * @author hakan
 */
public class Bank implements Entity {

    @JsonProperty(required = true)
    private String name;
    @JsonProperty(required = true)
    private Account account;
    @JsonProperty(required = true)
    @JsonFormat(pattern = "[A-Z]{6}([\\dA-Z]{2}|[\\dA-Z]{5})")
    private String bic;
    @JsonProperty(required = true)
    @JsonFormat(pattern = "[A-Z]{2}[\\dA-Z]{13,32}")
    private String iban;
    private List<String> bankGiro;
    private List<String> plusGiro;
    private String swish;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public List<String> getBankGiro() {
        return bankGiro;
    }

    public void setBankGiro(List<String> bankGiro) {
        this.bankGiro = bankGiro;
    }

    public List<String> getPlusGiro() {
        return plusGiro;
    }

    public void setPlusGiro(List<String> plusGiro) {
        this.plusGiro = plusGiro;
    }

    public String getSwish() {
        return swish;
    }

    public void setSwish(String swish) {
        this.swish = swish;
    }

    public static class Account implements Entity {

        @JsonProperty(required = true)
        private String accountNumber;
        @JsonProperty(required = true)
        private String clearingNumber;

        public String getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public String getClearingNumber() {
            return clearingNumber;
        }

        public void setClearingNumber(String clearingNumber) {
            this.clearingNumber = clearingNumber;
        }
    }
}
