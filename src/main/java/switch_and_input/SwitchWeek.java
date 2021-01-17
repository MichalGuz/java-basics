package switch_and_input;

import java.util.Scanner;

public class SwitchWeek {
    public static void printDayOfTheWeek() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number form range 1-7");
        int day = scanner.nextInt();
        scanner.nextLine();
    }
}
