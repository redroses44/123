package currency;

import quantity.Quantity;

import java.util.Date;

public class ISOCurrency extends Currency {

    private String ISOCurrencyCode;

    public ISOCurrency(String name, Quantity quantity, String definition, String alphabeticCode, Integer numericCode, String majorUnitSymbol, String minorUnitSymbol, Date expirationDate, Date introductionDate, float ratioOfMinorUnitToMajorUnit, String ISOCurrencyCode) {
        super(name, quantity, definition, alphabeticCode, numericCode, majorUnitSymbol, minorUnitSymbol, expirationDate, introductionDate, ratioOfMinorUnitToMajorUnit);
        this.ISOCurrencyCode = ISOCurrencyCode;
    }

    public String getISOCurrencyCode() {
        return ISOCurrencyCode;
    }

    @Override
    public String toString() {
        return "ISOCurrency{} " + super.toString();
    }
}
