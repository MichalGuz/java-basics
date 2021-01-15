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

    public static void minAndMaximumInputWithIntExtent() {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int number = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the number");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                number = scanner.nextInt();
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
            } else {
                System.out.println("Invalid value.");
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        scanner.close();
    }

    public static void minAndMaximumInputWithFlag() {
        int min = 0;
        int max = 0;
        int number = 0;
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;

        while (true) {
            System.out.println("Enter the number");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                number = scanner.nextInt();
                if (flag) {
                    flag = false;
                    min = number;
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
            } else {
                System.out.println("Invalid value.");
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        scanner.close();
    }

    public static void main(String[] args) {
        minAndMaximumInputWithFlag();
    }
}
