package tb_constructor_bills_burgers;

public class DeluxeBurger extends Hamburger {
    private String chips;
    private String drinks;

    public DeluxeBurger(String name, String roll, String meat, double price, String extra1, String extra2, String extra3, String extra4, String chips, String drinks) {
        super(name, roll, meat, price, extra1, extra2, extra3, extra4);
        this.chips = chips;
        this.drinks = drinks;
    }

    public DeluxeBurger() {
        this("deluxe burger", "white", "beef", 26.99, "lettuce", "mayo", "tomato", "red onion", "chips", "cola");
    }

    public String getChips() {
        return chips;
    }

    public String getDrinks() {
        return drinks;
    }
}
