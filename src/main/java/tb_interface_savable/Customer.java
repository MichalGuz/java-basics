package tb_interface_savable;

public class Customer implements Saveable {
    private String name;
    private int number;
    private int phone;
    private String email;

    public Customer(String name, int number, int phone, String email) {
        this.name = name;
        this.number = number;
        this.phone = phone;
        this.email = email;
    }

    public String showCustomerMessage() {
        return "The method from Customer class was used";
    }
}
