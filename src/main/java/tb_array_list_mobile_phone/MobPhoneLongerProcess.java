package tb_array_list_mobile_phone;

import java.util.Scanner;

public class MobPhoneLongerProcess {
    MobPhoneLonger mobPhoneLonger = new MobPhoneLonger();
    Scanner scanner = new Scanner(System.in);

    public void mobPhoneLongerProcess() {
        int choice = 0;
        boolean quit = false;
        mobPhoneLonger.printInstructions();
        while (!quit) {
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    mobPhoneLonger.printInstructions();
                    break;
                case 1:
                    mobPhoneLonger.printListOfNumbers();
                    break;
                case 2:
                    mobPhoneLonger.addContact();
                    break;
                case 3:
                    mobPhoneLonger.updateContact();
                    break;
                case 4:
                    mobPhoneLonger.removeContact();
                    break;
                case 5:
                    mobPhoneLonger.findContact();
                    break;
                case 6:
                    System.out.println("Quit the program was chosen. See you again!");
                    quit = true;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        MobPhoneLongerProcess operate = new MobPhoneLongerProcess();
        operate.mobPhoneLongerProcess();
    }
}
