package tb_interface_telephone;

public class TelephoneMain {
    public static void main(String[] args) {
        Telephone telephone;

        telephone = new DeskPhone(564564544);
        telephone.powerOn();
        telephone.callPhone(564564544);
        telephone.answer();

        telephone = new MobilePhone(433245454);
        telephone.powerOn();
        telephone.callPhone(433245454);
        telephone.isRinging();
        telephone.answer();
        telephone.dial(777334585);
    }
}
