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
}
