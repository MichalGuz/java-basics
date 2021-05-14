package tb_interface_savable;

import java.util.ArrayList;

public class MainSaveable {
    public static void main(String[] args) {
        Supplier one = new Supplier("one", 111, 1111, "Big_one");
        System.out.println(one);
        System.out.println(one.showSupplierMessage());
        one.setAccount(1001);
        one.setLogin("big1");
        System.out.println(one);

        Customer two = new Customer("two", 112, 600500600, "two@two.org");
        System.out.println(two);
        System.out.println(two.showCustomerMessage());

        Saveable three = new Supplier("three", 113, 3333, "mat3");
        System.out.println(three);
        System.out.println(((Supplier)three).showSupplierMessage());

        Saveable four = new Customer("four", 114, 4444, "Ropex");
        System.out.println(four);
        System.out.println(((Customer)four).showCustomerMessage());;


        public static ArrayList<String> readValues() {
            ArrayList<String> values = new ArrayList<String>();
        }
    }
}


