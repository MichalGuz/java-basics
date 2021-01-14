package tb_scanner;

import java.util.Scanner;

public class SumUsersInput {
    public static int sumUsersInput(int number) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 1;

        while (counter < 11) {
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
