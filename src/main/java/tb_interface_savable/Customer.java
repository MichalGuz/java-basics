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
        values.add(0, this.name);
        values.add(1, "" + this.number);
        values.add(2, "" + this.phone);
        values.add(3,this.email);
        return values;
    }

    @Override
    public void read(List<String> savedItems) {
        if(savedItems != null && savedItems.size() > 0){

        }

        }
}