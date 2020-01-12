package rate;

import rules.Rules;

import java.util.Date;

public class ExchangeRate {
    private float rate;
    private Date validFrom;
    private Date validTo;
    private ExchangeRateType type;

    public ExchangeRate(float rate, Date validTo, ExchangeRateType type) {
        this.rate = rate;
        this.validFrom = new Date();
        this.validTo = validTo;
        this.type = type;
    }

    public float getRate() {
        return rate;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public Date getValidTo() {
        return validTo;
    }

    public ExchangeRateType getType() {
        return type;
    }
}

