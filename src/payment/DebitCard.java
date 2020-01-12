package payment;

import money.Money;

import java.util.Date;

public class DebitCard extends PaymentCard{
    private Money dailyWithdrawalLimit;

    public DebitCard(String cardAssociationName, String cardNumber, String nameOnCard, Date expiryDate, String billingAddress, Date validFrom, String cardVerificationCode, String issueNumber, Money dailyWithdrawalLimit) {
        super(cardAssociationName, cardNumber, nameOnCard, expiryDate, billingAddress, validFrom, cardVerificationCode, issueNumber);
        this.dailyWithdrawalLimit = dailyWithdrawalLimit;
    }

    public DebitCard(Money dailyWithdrawalLimit) {
        super();
        this.dailyWithdrawalLimit = dailyWithdrawalLimit;
    }

    public Money getDailyWithdrawalLimit() {
        return dailyWithdrawalLimit;
    }

    @Override
    public String toString() {
        return "DebitCard{" +
                "dailyWithdrawalLimit=" + dailyWithdrawalLimit +
                "} " + super.toString();
    }
}
