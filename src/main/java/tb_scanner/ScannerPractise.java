package tb_scanner;

import java.util.Calendar;
import java.util.Scanner;

public class ScannerPractise {
    public static void scanInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter year of your birth;");
        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter your name:");
            String name = scanner.nextLine();

            int now = Calendar.getInstance().get(Calendar.YEAR);
            System.out.println("Current year = "+ now);

        }

    }
}
