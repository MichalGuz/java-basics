package tb_array_list_mobile_phone;

import java.util.ArrayList;
import java.util.Scanner;

public class MobPhoneLonger {
    ArrayList<Contact> contacts = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void printInstructions(){
        System.out.println("Press ");
        System.out.println("0 - To show the instructions." );
        System.out.println("1 - To print the list of contacts.");
        System.out.println("2 - To add a contact to the list.");
        System.out.println("3 - To modify a contact in the list.");
        System.out.println("4 - To remove a contact from the list.");
        System.out.println("5 - To search for a contact in the list.");
        System.out.println("6 - To quit the application.");
    }

    public void printListOfNumbers() {
        for(Contact item: contacts) {
            System.out.println("Contact: " + item.getName() + " " + item.getPhoneNumber());
        }
    }
}