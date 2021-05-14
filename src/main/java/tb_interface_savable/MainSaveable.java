package tb_interface_savable;

import java.util.ArrayList;
import java.util.Scanner;

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
        System.out.println(((Supplier) three).showSupplierMessage());

        Saveable four = new Customer("four", 114, 4444, "Ropex");
        System.out.println(four);
        System.out.println(((Customer) four).showCustomerMessage());
        ;
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;

        System.out.println("Choose\n" +
                "1 to enter a number\n" +
                "0 to quit");

        while (!quit) {
            System.out.println("Choose an option 0 or 1 four times in a row and then 0:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a number");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(Saveable item) {
        for (int i=0; i<item.save().size(); i++) {
            System.out.println("Saving " + item.save().get(i) + " to storage device");
        }
    }

    public static void loadObject(Saveable item) {
    }
}


