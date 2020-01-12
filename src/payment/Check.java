package payment;

import java.util.Date;

public class Check extends PaymentMethod {
    private String accountName;
    private String accountNumber;
    private String checkNumber;
    private String payee;
    private Date dateWritten;
    private String bankName;
    private String bankAddress;
    private String bankId;

    public Check(String methodName, String accountName, String accountNumber, String checkNumber, String payee, Date dateWritten, String bankName, String bankAddress, String bankId) {
        super(methodName);
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.checkNumber = checkNumber;
        this.payee = payee;
        this.dateWritten = dateWritten;
        this.bankName = bankName;
        this.bankAddress = bankAddress;
        this.bankId = bankId;
    }


    public String getAccountName() {
        return accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCheckNumber() {
        return checkNumber;
    }

    public String getPayee() {
        return payee;
    }

    public Date getDateWritten() {
        return dateWritten;
    }

    public String getBankName() {
        return bankName;
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public String getBankId() {
        return bankId;
    }
}
