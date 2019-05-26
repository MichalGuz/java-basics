package Input;

import java.util.Scanner;

public class InputString {
    public void inputString(){

        //create Scanner object
        Scanner input = new Scanner(System.in);
        //output the prompt
        System.out.println("Enter the line of text");

        //wait for the user to enter a line of text
        String line = input.nextLine();

        System.out.println("You entered " + line);
    }
}
