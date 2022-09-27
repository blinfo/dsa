package dsa.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/**
 *
 * @author hakan
 */
public class Exchange implements Entity {

        @JsonProperty(required = true)
        @JsonFormat(pattern = "[A-Z]{3}")
        private String currency;
        @JsonProperty(required = true)
        private BigDecimal rate;

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public BigDecimal getRate() {
            return rate;
        }

        public void setRate(BigDecimal rate) {
            this.rate = rate;
        }

}
