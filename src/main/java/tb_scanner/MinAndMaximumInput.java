package tb_scanner;

import java.util.Scanner;

public class MinAndMaximumInput {
    public static void minAndMaximumInput() {
        int min = 0;
        int max = 0;
        int number = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");
        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            number = scanner.nextInt();
            min = number;
            max = number;

            while (true) {
                System.out.println("Enter the number");
                boolean isNextInt = scanner.hasNextInt();
                if (isNextInt) {
                    number = scanner.nextInt();
                    if (number < min) {
                        min = number;
                    }
                    if (number > max) {
                        max = number;
                    }
                } else {
                    break;
                }

                System.out.println("Min = " + min);
                System.out.println("Max = " + max);
            }
        } else {
            System.out.println("Invalid value.");
            scanner.nextLine();
        }
        scanner.close();
    }
}
