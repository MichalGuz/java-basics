package tb_interface_savable;

import java.util.ArrayList;
import java.util.List;

public class Supplier implements Saveable {
    private String name;
    private int number;
    private int account;
    private String login;

    public Supplier(String name, int number, int account, String login) {
        this.name = name;
        this.number = number;
        this.account = account;
        this.login = login;
    }

    @Override
    public String toString() {
        return "Supplier:\n " +
                " name = " + this.name +
                ", number = " + this.number +
                ", account = " + this.account +
                ", login = " + this.login;
    }

    @Override
    public List<String> save() {
        List<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, "" + this.number);
        values.add(2, "" + this.account);
        values.add(3,this.login);
        return values;

    }

    @Override
    public void read(List<String> savedItems) {

    }
}
