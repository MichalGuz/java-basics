package tb_array_list_mobile_phone;

import java.util.ArrayList;
import java.util.Scanner;

public class MobPhoneLonger {
    ArrayList<Contact> contacts = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void printInstructions() {
        System.out.println("Press ");
        System.out.println("0 - To show the instructions.");
        System.out.println("1 - To print the list of contacts.");
        System.out.println("2 - To add a contact to the list.");
        System.out.println("3 - To modify a contact in the list.");
        System.out.println("4 - To remove a contact from the list.");
        System.out.println("5 - To search for a contact in the list.");
        System.out.println("6 - To quit the application.");
    }

    public void printListOfNumbers() {
        for (Contact item : contacts) {
            System.out.println("Contact: " + item.getName() + " " + item.getPhoneNumber());
        }
    }

    public void addContact() {
        System.out.print("Enter the name:\n");
        String name = scanner.nextLine();
        System.out.print("Enter the number:\n");
        String number = scanner.nextLine();
        Contact contact = new Contact(name, number);
        add(contact);
    }

    public void updateContact() {
        System.out.print("Choose contact to update - enter the name:\n");
        String name = scanner.nextLine();
        if(searchOnList(name)) {
            System.out.print("Enter the name to update:\n");
            String updatedName = scanner.nextLine();
            System.out.print("and enter the number to update\n");
            String updatedNumber = scanner.nextLine();
            Contact currentContact = contacts.get(findIndex(name));
            Contact updatedContact = new Contact(updatedName, updatedNumber);
            update(currentContact, updatedContact);
        } else {
            System.out.println("Given contact doesn't exist");
        }
    }

    public void removeContact() {
        System.out.print("Choose contact to remove - enter the name:\n");
        String name = scanner.nextLine();
        if (searchOnList(name)) {
            remove(name);
        } else {
            System.out.println("Given contact doesn't exist");
        }
    }

    public void findContact() {
        System.out.print("Choose contact to find - enter the name:\n");
        String name = scanner.nextLine();
        if (searchOnList(name)) {
            int index = findIndex(name);
            System.out.println(name + " " + contacts.get(index).getPhoneNumber());
        }  else {
            System.out.println("Given contact doesn't exist");
        }
    }

    private void add(Contact contact) {
        contacts.add(contact);
    }

    private void update(Contact contact, Contact updated) {
        int index = findIndex(contact.getName());
        contacts.set(index, updated);
    }

    private void remove(String name) {
        int toRemove = findIndex(name);
        contacts.remove(toRemove);
    }

    private boolean searchOnList(String name) {
        boolean result = false;
        int counter = 0;
        while(counter < contacts.size()) {
            for (Contact c : contacts) {
                if (c.getName().equals(name)) {
                    result = true;
                    counter = contacts.size();
                }
                counter++;
            }
        }
        return result;
    }

    private int findIndex(String name) {
        boolean result = false;
        int index = -1;
        while (result == false) {
            for (int i =0; i<contacts.size(); i++) {
                if (contacts.get(i).getName().equals(name)) {
                    result = true;
                    index = i;
                }
            }
        }
        return index;
    }
}
