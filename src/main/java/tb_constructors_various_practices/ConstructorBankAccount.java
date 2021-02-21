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
}
