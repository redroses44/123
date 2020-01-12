package payment;

import java.util.Date;

public abstract class PaymentCard extends PaymentMethod {

    private String cardAssociationName;
    private String cardNumber;
    private String nameOnCard;
    private Date expiryDate;
    private String billingAddress;
    private Date validFrom;
    private String cardVerificationCode;

    public PaymentCard(String cardAssociationName, String cardNumber, String nameOnCard, Date expiryDate, String billingAddress, Date validFrom, String cardVerificationCode, String issueNumber) {
        this.cardAssociationName = cardAssociationName;
        this.cardNumber = cardNumber;
        this.nameOnCard = nameOnCard;
        this.expiryDate = expiryDate;
        this.billingAddress = billingAddress;
        this.validFrom = validFrom;
        this.cardVerificationCode = cardVerificationCode;
        this.issueNumber = issueNumber;
    }

    public PaymentCard() {

    }

    public String getCardAssociationName() {
        return cardAssociationName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public String getCardVerificationCode() {
        return cardVerificationCode;
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    private String issueNumber;
}
