package tb_constructor_vip_customer;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "emailAddress");
    }

    public VipCustomer() {
        this("defaultName", 1000, "defaultAddress");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public static void main(String[] args) {
        VipCustomer vipCustomer1 = new VipCustomer();
        System.out.println(vipCustomer1.getName() + " " + vipCustomer1.getCreditLimit() + " " + vipCustomer1.getEmailAddress());

        VipCustomer vipCustomer2 = new VipCustomer("John Customer2",5000.0);
        System.out.println(vipCustomer2.getName() + " " + vipCustomer2.getCreditLimit() + " " + vipCustomer2.getEmailAddress());

        VipCustomer vipCustomer3 = new VipCustomer("Jack Customer3", 333333, "jacko33@xyz.com");
        System.out.println(vipCustomer3.getName() + " " + vipCustomer3.getCreditLimit() + " " + vipCustomer3.getEmailAddress());
    }
}
