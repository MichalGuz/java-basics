package tb_array_list_mobile_phone;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber, ArrayList<Contact> myContacts) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact already exists");
            return false;
        }  else {
            myContacts.add(contact);
            return true;
        }
    }

    public boolean updateContact(Contact oldContact, Contact updatedContact) {
        int foundIndex = findContact(oldContact);
        if (foundIndex < 0) {
            System.out.println("The contact: " + oldContact.getName() + " " + oldContact.getPhoneNumber() + " is not on the list");
            return false;
        } else if (findContact(updatedContact.getName()) != -1) {
            System.out.println("Contact with name " + updatedContact.getName() + " already exists");
            return false;
        } else {
            myContacts.set(foundIndex, updatedContact);
            System.out.println("The old contact: " + oldContact.getName() + " was replaced by a new one: " + updatedContact.getName());
            return true;
        }
    }
}
