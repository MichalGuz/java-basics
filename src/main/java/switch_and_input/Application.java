package switch_and_input;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the command:");

        String text = input.nextLine();

        switch(text){
            case "start":
                System.out.println("Program just started");
                break;

            case "stop":
                System.out.println("Program has stopped");

            default:
                System.out.println("Command not recognized.\nTry one more time!");
        }
    }
}
