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

            int age = now - yearOfBirth;

            System.out.println("Hi " + name + "!");
            if(age < 18 && age > 0) {
                System.out.println("You are only " + age + " years old. You are too young to enter the website.");
            } else if (age >= 18 && age < 110){
                System.out.println("You are " + age + " years old. Welcome to the website!" );
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }
        scanner.close();
    }

}
}
