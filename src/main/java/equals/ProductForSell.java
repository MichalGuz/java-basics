package equals;

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
        if ((this.getName() == other.getName()) && (this.getPrice() == other.getPrice())) return true;
        return true;
    }
}
