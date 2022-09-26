package dsa.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 *
 * @author hakan
 */
public class Address implements Entity {

    @JsonProperty(required = true)
    private String label;
    @JsonProperty(required = true)
    private String name;
    @JsonProperty(required = true)
    private List<Line> addressLines;
    @JsonProperty(required = true)
    private String zip;
    @JsonProperty(required = true)
    private String city;
    @JsonProperty(required = true)
    @JsonFormat(pattern = "[A-Z]{2}")
    private String country;
    private List<PhoneNumber> phoneNumbers;
    private List<EmailAddress> emailAddresses;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Line> getAddressLines() {
        return addressLines;
    }

    public void setAddressLines(List<Line> addressLines) {
        this.addressLines = addressLines;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public List<EmailAddress> getEmailAddresses() {
        return emailAddresses;
    }

    public void setEmailAddresses(List<EmailAddress> emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    public static class Line implements Entity {

        @JsonProperty(required = true)
        private String text;
        @JsonProperty(required = true)
        private Integer index;

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public Integer getIndex() {
            return index;
        }

        public void setIndex(Integer index) {
            this.index = index;
        }

    }
}
