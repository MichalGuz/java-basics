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
        telephone.dial(433245454);
        telephone.callPhone(777334585);
        telephone.isRinging();
        telephone.answer();
    }
}
