package tb_scanner;

import java.util.Scanner;

public class SumAndAverageInput {
    public static void sumAndAverageInput() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int enteredInteger = 0;
        double average = 0;
        int counter = 0;

        System.out.println("Start");
        while (true) {
            System.out.println("Enter an integer");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                enteredInteger = scanner.nextInt();
                sum += enteredInteger;
                counter++;
            } else {
                break;
            }
            scanner.nextLine();
        }
        average = sum / counter;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        scanner.close();
    }

    public static void main(String[] args) {
        sumAndAverageInput();
    }
}

