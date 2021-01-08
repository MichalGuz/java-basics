package simplest;

public class Simplest {
    public static void printEqual(int a, int b, int c) {
        if ( (a < 0) || (b < 0) || (c < 0)) {
            System.out.println("Invalid Value");
        } else if ( (a!= b) && (a!= c) && (b!=c)){
            System.out.println("All numbers are different");
        } else if ( (a == b) && (a == c) && (b ==c)){
            System.out.println("All numbers are equal");
        }
    }
}
