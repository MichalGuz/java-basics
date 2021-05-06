package tb_interface_telephone;

public class MobilePhone implements Telephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Turn on the mobile phone");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Dial number:  " + phoneNumber + " on the mobile phone");
        } else {
            System.out.println("The mobile phone is off ");
        }
    }
}
