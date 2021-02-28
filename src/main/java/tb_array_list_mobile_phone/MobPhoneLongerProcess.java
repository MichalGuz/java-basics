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
        }
    }
}
