package dsa.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author hakan
 */
public class Account {

    @JsonProperty(required = true)
    private String number;
    @JsonProperty(required = true)
    private String label;
    private String numberPreviousYear;
    private List<String> sruCodes;
    private BigDecimal openingBalance;
    private BigDecimal closingBalance;
    private BigDecimal result;
    private Type type;
    @JsonFormat(pattern = "d{1,2}")
    private String vatCode;
    
    public enum Type {
        ASSET, COST, LIABILITY, REVENUE, MISC
    }
}
