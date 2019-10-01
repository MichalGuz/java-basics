package equals_products;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Drink("chopin", 30);
        Product p4 = new Drink("name", 10);
        Product p2 = new Food("chopin", 30);
        Product p3 = new Food("chopi", 3);
        Drink d1 = new Drink("chopin", 30);
        Food f1 = new Food("chopin", 30);
        Food f2 = new Food("chopin", 30);

        Drink d1 = new Drink("chopin", 30);
        Food f1 = new Food("chopin", 30);
        Food f2 = new Food("chopin", 30);
        System.out.println(p1.equals(p1) + " [ " + p1.name + " = " + p1.name + ", " + p1.price + " = " + p1.price + "]" + "comparing classes:  " + p1.getClass() + " : " + p1.getClass());
        System.out.println(p1.equals(p2) + " [ " + p1.name + " = " + p2.name + ", " + p1.price + " = " + p2.price + "]" + "comparing classes:  " + p1.getClass() + " : " + p2.getClass());
        System.out.println(p2.equals(p3) + " [ " + p2.name + " = " + p3.name + ", " + p2.price + " = " + p3.price + "]" + "comparing classes:  " + p2.getClass() + " : " + p3.getClass());
        System.out.println(p1.equals(p4) + " [ " + p1.name + " = " + p4.name + ", " + p1.price + " = " + p4.price + "]" + "comparing classes:  " + p1.getClass() + " : " + p4.getClass());
        System.out.println(d1.equals(f1) + " [ " + d1.name + " = " + f1.name + ", " + d1.price + " = " + f1.price + "]" + "comparing classes:  " + d1.getClass() + " : " + f1.getClass());
        System.out.println(f1.equals(f2) + " [ " + f1.name + " = " + f2.name + ", " + f1.price + " = " + f2.price + "]" + "comparing classes:  " + f1.getClass() + " : " + f2.getClass());

    }
}
