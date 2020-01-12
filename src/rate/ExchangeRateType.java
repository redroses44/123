package rate;

import java.util.Currency;
import java.util.Date;

public class ExchangeRateType {
    private static int count = 0;
    private static Integer id = 1;
    private String desc;
    private Date validFrom;
    private Date validTo;

    public ExchangeRateType(String desc, Date validTo) {
        this.id = ++count;
        this.desc = desc;
        this.validFrom = new Date();
        this.validTo = validTo;
    }

    public String getDesc() {
        return desc;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public Date getValidTo() {
        return validTo;
    }


    public boolean isApplicable(ExchangeRate rate) {
        if (rate.getType().getDesc().equals("VALID RATE")) {
            return true;
        } else {
            throw new Error("RATE IS INVALID");
        }
    }
}
