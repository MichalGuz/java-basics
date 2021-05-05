package tb_interface_telephone;

public interface Telephone {
    public void powerOn();
    public void dial(int phoneNumber);
    public void answer();
    public boolean callPhone(int phoneNumber);
    public boolean isRinging();
}
