package tb_scanner;

import java.util.Scanner;

public class SumAndAverageInput {
    public void sumAndAverageInput() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int enteredInteger = 0;

        System.out.println("Start");
        while(true) {
            System.out.println("Enter an integer");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                enteredInteger = scanner.nextInt();
                scanner.nextLine();
                sum += enteredInteger;
            }
        }

    }
}