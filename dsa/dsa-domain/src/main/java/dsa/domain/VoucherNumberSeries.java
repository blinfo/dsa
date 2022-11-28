package dsa.domain;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 *
 * @author hakan
 */
public record VoucherNumberSeries(
        @JsonProperty(required = true)
        @JsonFormat(pattern = "[\\dA-Z#]{1}")
        String number,
        String label,
        @JsonProperty(required = true)
        List<Voucher> vouchers) {

}
