package payment;

import money.Money;

import java.util.Date;

public class CreditCard extends PaymentCard {
    private Money creditLimit;
    private Money dailyWithdrawalLimit;

    public CreditCard(String cardAssociationName, String cardNumber, String nameOnCard, Date expiryDate, String billingAddress, Date validFrom, String cardVerificationCode, String issueNumber, Money creditLimit, Money dailyWithdrawalLimit) {
        super(cardAssociationName, cardNumber, nameOnCard, expiryDate, billingAddress, validFrom, cardVerificationCode, issueNumber);
        this.creditLimit = creditLimit;
        this.dailyWithdrawalLimit = dailyWithdrawalLimit;
    }


    public Money getCreditLimit() {
        return creditLimit;
    }

    public Money getDailyWithdrawalLimit() {
        return dailyWithdrawalLimit;
    }
}
