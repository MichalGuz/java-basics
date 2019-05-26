package Input;

import java.util.Scanner;

public class InputString {
    public void inputString(){

//      create Scanner object
        Scanner input = new Scanner(System.in);

//      output the prompt
        System.out.println("Enter the line of text");

        String line = input.nextLine();

    }
}
