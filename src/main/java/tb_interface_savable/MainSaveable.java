package tb_interface_savable;

public class MainSaveable {
    public static void main(String[] args) {
        Supplier one = new Supplier("one", 111, 1111, "Big_one");
        System.out.println(one);
        System.out.println(one.showSupplierMessage());
        one.setAccount(1001);
        one.setLogin("big1");
        System.out.println(one);

        Customer two = new Customer("two", 112, 600500600, "two@two.org");
        System.out.println(two);
        System.out.println(two.showCustomerMessage());

        Saveable three = new Supplier("three", 113, 3333, "mat3");

    }
}

