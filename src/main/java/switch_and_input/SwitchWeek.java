package switch_and_input;

import java.util.Scanner;

public class SwitchWeek {
    public static void printDayOfTheWeek() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number form range 1-7");
        int day = scanner.nextInt();
        scanner.nextLine();

        switch (day) {
            case 0:
                System.out.println("End");
                scanner.close();
                break;
            case 1:
                System.out.println("Monday" + "\n[to quit enter 0]");
                break;
            case 2:
                System.out.println("Tuesday" + "\n[to quit enter 0]");
                break;
            case 3:
                System.out.println("Wednesday" + "\n[to quit enter 0]");
                break;
            case 4:
                System.out.println("Thursday" + "\n[to quit enter 0]");
                break;
            case 5:
                System.out.println("Friday" + "\n[to quit enter 0]");
                break;
            case 6:
                System.out.println("Saturday" + "\n[to quit enter 0]");
                break;
            case 7:
                System.out.println("Sunday" + "\n[to quit enter 0]");
                break;
        }
    }
}
