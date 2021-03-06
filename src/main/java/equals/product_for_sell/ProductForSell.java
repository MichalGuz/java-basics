package equals.product_for_sell;

public class ProductForSell {
    private String name;
    private int price;

    public ProductForSell(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public boolean equals(Object o){
        if (this == o) return true;
        if (this == null) return false;
        if (getClass() != o.getClass()) return false;
        ProductForSell other = (ProductForSell) o;
        if (this.getName() == null){
            if (other.getName() != null)
                return false;
        } else if (!(this.getName() == other.getName()))
            return false;
        if (this.getPrice() != other.getPrice()) return false;
        return true;
    }

    public static void main(String[] args) {
        ProductForSell p1 = new ProductForSell("atom", 2);
        ProductForSell p2 = new ProductForSell("atom", 2);
        ProductForSell p3 = new ProductForSell("atom", 20);
        System.out.println(p1.equals(p1));
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
    }
}
