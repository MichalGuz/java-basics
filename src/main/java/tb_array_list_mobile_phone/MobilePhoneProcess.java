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
}