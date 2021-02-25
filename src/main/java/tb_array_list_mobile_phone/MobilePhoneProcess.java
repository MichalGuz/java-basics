package tb_array_list_mobile_phone;

import java.util.Scanner;

public class MobilePhoneProcess {
    MobilePhone mobilePhone = new MobilePhone("999111999");

    Scanner scanner = new Scanner(System.in);

    public void mobilePhoneProcess() {
    }

    private void printInstructions() {
        System.out.println("Available actions:\npress:");
        System.out.println("0 - to shutdown\n" +
                "1 - to print contacts\n" +
                "2 - to add a new contact\n" +
                "3 - to update an existing contact\n" +
                "4 - to remove an existing contact\n" +
                "5 - to query an existing contact\n" +
                "6 - to print a list of available actions");
    }

    private void add() {
        System.out.println("Enter the name:");
        String name = scanner.nextLine();
        System.out.println("Enter the phone number:");
        String phoneNumber = scanner.nextLine();
        Contact contact = Contact.createContact(name, phoneNumber);
        if (mobilePhone.addNewContact(contact)) {
            System.out.println("Contact added: " + name + " " + phoneNumber);
        }
    }

    private void update() {
        System.out.println("Enter the name:");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found");
        }
        System.out.println("Enter the new contact name");
        String contactsNewName = scanner.nextLine();
        System.out.println("Enter the new contact phone number");
        String contactsNewPhoneNumber = scanner.nextLine();
        Contact updatedContact = Contact.createContact(contactsNewName, contactsNewPhoneNumber);
        if (mobilePhone.updateContact(existingContact, updatedContact)) {
            System.out.println("Successfully updated");
        } else {
            System.out.println("Error updating contact");
        }
    }

    private void remove() {
    }
}