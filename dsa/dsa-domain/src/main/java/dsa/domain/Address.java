package dsa.domain;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 *
 * @author hakan
 */
public record Address(
        @JsonProperty(required = true)
        String label,
        @JsonProperty(required = true)
        String name,
        @JsonProperty(required = true)
        List<Line> addressLines,
        @JsonProperty(required = true)
        String zip,
        @JsonProperty(required = true)
        String city,
        @JsonProperty(required = true)
        @JsonFormat(pattern = "[A-Z]{2}")
        String country,
        List<PhoneNumber> phoneNumbers,
        List<EmailAddress> emailAddresses) implements Entity {

    public static record Line(
            @JsonProperty(required = true)
            String text,
            @JsonProperty(required = true)
            Integer index) implements Entity {

    }
}
