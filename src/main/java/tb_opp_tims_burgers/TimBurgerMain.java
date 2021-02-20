package tb_opp_tims_burgers;

public class TimBurgerMain {
    public static void main(String[] args) {
        TimHamburger hamburger = new TimHamburger();
        hamburger.addHamburgerAddition1("lettuce", 0.45);
        hamburger.addHamburgerAddition2("tomato",0.65);
        hamburger.addHamburgerAddition3("barbecue sauce", 0.30);
        hamburger.itemizeHamburger();

        TimDeluxeBurger deluxeBurger = new TimDeluxeBurger();
        deluxeBurger.itemizeHamburger();

        TimHealthyBurger healthyBurger = new TimHealthyBurger();
    }
}

