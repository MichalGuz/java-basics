package tb_scanner;

import java.util.Scanner;

public class SumUsersInput {
    public static int sumUsersInput(int number) {
        if(number < 1) {
            System.out.println("Invalid value of sumUsersInput method's argument");
            return -1;
        }
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;

        while (counter < number) {
            System.out.println("Enter number #" + counter);
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                counter++;
                sum += scanner.nextInt();
            } else {
                System.out.println("Invalid Value");
            }
            scanner.nextLine();
        }
        return sum;
    }
}
