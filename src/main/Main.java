package main;

import currency.Currency;
import currency.CurrencyConverter;
import currency.ISOCurrency;
import locale.Locale;
import money.Money;
import payment.DebitCard;
import payment.Payment;
import quantity.Quantity;
import rate.ExchangeRate;
import rate.ExchangeRateType;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Quantity quantity = new Quantity(40.0);
        Quantity quantity1 = new Quantity(100.0);
        Quantity quantity2 = new Quantity(1000.0);
        Currency curr = new ISOCurrency("testcur", quantity2, "testdef",
                "21dqq42", 3913931, "20kcwk", "30fkqad", new Date(), new Date(), 12f, "abc123");
        Money limit = new Money(curr);
        Currency currency = new ISOCurrency("testcur", quantity, "testdef",
                "21dqq42", 3913931, "20kcwk", "30fkqad", new Date(), new Date(), 12f, "abc123");
        Money money = new Money(currency);
        Currency currency1 = new ISOCurrency("testcurr2", quantity1, "testdef",
                "21dqq42", 3913931, "20kcwk", "30fkqad", new Date(), new Date(), 12f, "abc123");
        Locale locale = new Locale("US", "USA, Boston");
        Locale locale2 = new Locale("EU", "Europe, Estonia");
        Money largestMoney = new Money(curr);
        Money money1 = new Money(currency1);

        DebitCard debitCard = new DebitCard(limit);
        Payment payment = new Payment(new Date(), new Date(), new Date(), new Date(), debitCard, largestMoney);

        payment.pay(money1);

        System.out.println(payment.pay(money));


        ExchangeRateType type = new ExchangeRateType("VALID RATE", new Date());
        ExchangeRate rate = new ExchangeRate(1.5f, new Date(), type);

        System.out.println(type.isApplicable(rate)
        );

        CurrencyConverter converter = new CurrencyConverter();

        converter.exchange(money1, rate);

        //System.out.println(money1.getCurrency());
        //System.out.println();

        //System.out.println(money1.getCurrency(). getAmount());

        currency.addLocale(locale);
        //System.out.println(currency.isCurrencyAccepted(locale));
        //currency.addLocale(locale2);
        //System.out.println(currency.isCurrencyAccepted(locale));
    }
}
