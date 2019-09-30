package equals_products;

public class Product {
    String name;
    double price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        Product other = (Product) obj;

        System.out.println("This name = " + this.name);
        System.out.println("This price = " + this.price);
        System.out.println("Obj name = " + other.name);
        System.out.println("Obj price = " + other.price);

        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price)) {
            return false;
        }


        return true;
    }
}
