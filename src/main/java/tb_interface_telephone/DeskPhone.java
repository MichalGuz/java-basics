package tb_interface_telephone;

public class DeskPhone implements Telephone {
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Turn on the desk phone");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Dial number:  " + phoneNumber + " on the desk phone");
    }
}
