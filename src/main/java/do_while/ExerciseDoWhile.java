package do_while;

import java.util.Scanner;

public class ExerciseDoWhile {
    public static void main(String[] args) {

        int value = 0;

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("enter the number from 0 to 9:");
            value = scanner.nextInt();

        } while(value!=5);
        System.out.println("Bingo! You got 5!");
    }
}
