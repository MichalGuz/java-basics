package switch_and_input;

public class SwitchWithDefault {
    public static void switchValuePractise(int switchValue) {
        switch (switchValue) {
            case 1:
                System.out.println("Value equals 1");
                break;
            case 2:
                System.out.println("Value equals 2");
                break;
            default:
                System.out.println("Value is not 1 or 2");
                break;
        }
    }

    public static void switchLetterPractise(char letter) {
        switch (letter) {
            case 'A':
                System.out.println("It is A");
                break;
            case 'B':
                System.out.println("It is B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("It is a letter " + letter);
                break;
            default:
                System.out.println("It is not A, B, C, D or E");
                break;
        }
    }
}
