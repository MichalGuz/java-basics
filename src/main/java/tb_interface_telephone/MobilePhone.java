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

    @Override
    public void answer() {
        System.out.println("Answer the call on the mobile phone");
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn) {
            System.out.println("The " + phoneNumber + " is calling the mobile phone");
            isRinging = true;
        } else {
            isRinging = false;
        }
        return isRinging;
    }
}
