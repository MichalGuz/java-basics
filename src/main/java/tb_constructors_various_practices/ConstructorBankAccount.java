package tb_constructors_various_practices;

public class ConstructorBankAccount {
    private String accountNumber;
    private double balance;
    private String nameOfCustomer;
    private String emailOfCustomer;
    private String phoneNumberOfCustomer;

    public ConstructorBankAccount(String accountNumber, double balance, String nameOfCustomer, String emailOfCustomer, String phoneNumberOfCustomer) {
        System.out.println("ConstructorBankAccount constructor with parameters called.");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.nameOfCustomer = nameOfCustomer;
        this.emailOfCustomer = emailOfCustomer;
        this.phoneNumberOfCustomer = phoneNumberOfCustomer;
    }

    public ConstructorBankAccount() {
        this("1234", 100.0,"Default name", "Default email", "Default phone number");
        System.out.println("ConstructorBankAccount constructor with default parameters called");
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getNameOfCustomer() {
        return nameOfCustomer;
    }

    public String getEmailOfCustomer() {
        return emailOfCustomer;
    }

    public String getPhoneNumberOfCustomer() {
        return phoneNumberOfCustomer;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setNameOfCustomer(String nameOfCustomer) {
        this.nameOfCustomer = nameOfCustomer;
    }

    public void setEmailOfCustomer(String emailOfCustomer) {
        this.emailOfCustomer = emailOfCustomer;
    }

    public void setPhoneNumberOfCustomer(String phoneNumberOfCustomer) {
        this.phoneNumberOfCustomer = phoneNumberOfCustomer;
    }
}
