package tb_interface_savable;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public String toString() {
        return "Customer:\n " +
                " name = " + this.name +
                ", number = " + this.number +
                ", phone = " + this.phone +
                ", email = " + this.email;
    }

    @Override
    public List<String> save() {
        List<String> values = new ArrayList<>();
    }
}