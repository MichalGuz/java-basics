package Input;

import java.util.Scanner;

public class Input {
    public void inputString(){

        //create Scanner object
        Scanner input = new Scanner(System.in);
        //output the prompt
        System.out.println("Enter the line of text");

        //wait for the user to enter a line of text
        String line = input.nextLine();

        //Tell them what they entered
        System.out.println("You entered " + line);
    }
}
