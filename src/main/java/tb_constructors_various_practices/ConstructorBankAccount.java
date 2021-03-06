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

    public void deposit(double quotaOfDeposit) {
        this.balance += quotaOfDeposit;
        System.out.println("balance = " + this.balance);
    }

    public void withdraw(double quotaOfWithdrawal) {
        if (quotaOfWithdrawal > this.balance) {
            System.out.println("The quota of withdrawal exceeds the balance.");
        } else {
            this.balance -= quotaOfWithdrawal;
            System.out.println("balance = " + this.balance);
        }
    }

    public static void main(String[] args) {
        ConstructorBankAccount constructorBankAccount = new ConstructorBankAccount();

        constructorBankAccount.setBalance(1000);
        constructorBankAccount.deposit(250);
        constructorBankAccount.withdraw(700);
        constructorBankAccount.deposit(2000);
        constructorBankAccount.withdraw(3000);

        System.out.println(constructorBankAccount.getAccountNumber());
        System.out.println(constructorBankAccount.getBalance());
        System.out.println(constructorBankAccount.getNameOfCustomer());
        System.out.println(constructorBankAccount.getEmailOfCustomer());
        System.out.println(constructorBankAccount.getPhoneNumberOfCustomer());
    }
}

