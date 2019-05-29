package input;

import java.util.Scanner;

public class Alibaba {
    String login = "Ali";
    String password = "Open sesame";

    public void findTreasury() {
        Scanner firstInput = new Scanner(System.in);
        System.out.println("Please enter your login!");
        String line0 = firstInput.nextLine();
        if(login == line0){
            System.out.println("Please enter the password!");
            Scanner secondInput = new Scanner(System.in);
            String line1 = secondInput.nextLine();
            if(password == line1){
                System.out.println("Congratulations! You opened the treasury!");
            } else {
                System.out.println("Try again!");
            }
        } else {
            System.out.println("Wrong login. Try again!");
        }
    }
}
