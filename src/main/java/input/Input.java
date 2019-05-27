package input;

import java.util.Scanner;

public class Input {
    public void inputString(){

        //create Scanner object
        Scanner input0 = new Scanner(System.in);
        //output the prompt
        System.out.println("Enter the line of text");

        //wait for the user to enter a line of text
        String line0 = input0.nextLine();

        //Tell them what they entered
        System.out.println("You entered: [ " + line0 + " ]");
    }

    public void inputInt(){

        Scanner input1 = new Scanner(System.in);

        System.out.println("Enter the integer");

        Integer line1 = input1.nextInt();

        System.out.println("Your integer is: [ " + line1 + " ]" );
    }
}
