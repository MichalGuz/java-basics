package tb_opp_tims_burgers;

public class TimDeluxeBurger extends TimHamburger {
    public TimDeluxeBurger() {
        super("deluxe", "bacon", 12.50, "white");
        super.addHamburgerAddition1("chips", 1.75);
        super.addHamburgerAddition2("drink", 0.90);
    }

        @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}
