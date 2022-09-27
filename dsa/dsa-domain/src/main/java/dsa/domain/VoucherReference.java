package dsa.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author hakan
 */
public class VoucherReference implements Entity {

    @JsonProperty(required = true)
    @JsonFormat(pattern = "[\\dA-Z#]{1}")
    private String series;
    @JsonProperty(required = true)
    private Long number;
    @JsonProperty(required = true)
    private Long financialYearId;

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Long getFinancialYearId() {
        return financialYearId;
    }

    public void setFinancialYearId(Long financialYearId) {
        this.financialYearId = financialYearId;
    }
}
