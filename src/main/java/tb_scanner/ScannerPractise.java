package tb_scanner;

import java.util.Scanner;

public class ScannerPractise {
    public static void scanInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter year of your birth;");
        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();
        }

    }
}
