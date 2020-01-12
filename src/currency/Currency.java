package currency;

import locale.Locale;
import quantity.Quantity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Currency {
    private String name;
    private Quantity quantity;
    private String definition;
    private String alphabeticCode;
    private Integer numericCode;
    private String majorUnitSymbol;
    private String minorUnitSymbol;
    private Date expirationDate;
    private Date introductionDate;
    private float ratioOfMinorUnitToMajorUnit;
    private List<Locale> locales = new ArrayList<>();

    public Currency(String name, Quantity amount, String definition, String alphabeticCode, Integer numericCode, String majorUnitSymbol, String minorUnitSymbol, Date expirationDate, Date introductionDate, float ratioOfMinorUnitToMajorUnit) {
        this.name = name;
        this.quantity = amount;
        this.definition = definition;
        this.alphabeticCode = alphabeticCode;
        this.numericCode = numericCode;
        this.majorUnitSymbol = majorUnitSymbol;
        this.minorUnitSymbol = minorUnitSymbol;
        this.expirationDate = expirationDate;
        this.introductionDate = introductionDate;
        this.ratioOfMinorUnitToMajorUnit = ratioOfMinorUnitToMajorUnit;
    }

    public Currency() {

    }

    public Quantity getQuantity() {
        return quantity;
    }

    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getAlphabeticCode() {
        return alphabeticCode;
    }

    public Integer getNumericCode() {
        return numericCode;
    }

    public String getMinorUnitSymbol() {
        return minorUnitSymbol;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public Date getIntroductionDate() {
        return introductionDate;
    }

    public float getRatioOfMinorUnitToMajorUnit() {
        return ratioOfMinorUnitToMajorUnit;
    }


    public String getDefinition() {
        return definition;
    }

    public String getMajorUnitSymbol() {
        return majorUnitSymbol;
    }

    public boolean isCurrencyAccepted(Locale locale) {
        for (Locale loc : locales) {
            if (loc.getName().equals(locale.getName())) {
                return true;
            }
        }
        return false;
    }

    public void addLocale(Locale locale) {
        locales.add(locale);
    }

    public List<Locale> getLocales() {
        return locales;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", definition='" + definition + '\'' +
                ", alphabeticCode='" + alphabeticCode + '\'' +
                ", numericCode=" + numericCode +
                ", majorUnitSymbol='" + majorUnitSymbol + '\'' +
                ", minorUnitSymbol='" + minorUnitSymbol + '\'' +
                ", expirationDate=" + expirationDate +
                ", introductionDate=" + introductionDate +
                ", ratioOfMinorUnitToMajorUnit=" + ratioOfMinorUnitToMajorUnit +
                ", locales=" + locales +
                '}';
    }
}
