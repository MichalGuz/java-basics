package switch_and_input;

public class SwitchWithDefault {
    public void switchValuePractise() {
        int switchValue = 1;

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
