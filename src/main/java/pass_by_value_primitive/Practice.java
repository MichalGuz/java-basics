package pass_by_value_primitive;

public class Practice {
    private static int increase(int i){
        return i+i;
    }

    int a;
    int b;

    private static void change(Practice p){
        p.a++;
        p.b++;
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println("The x before invoking increase method is: " + x);
        int result = increase(x);
        System.out.println("The x after invoking increase method is: " + result);

        Practice pr = new Practice();
        pr.a = 2;
        pr.b = 5;

        change(pr);
        System.out.println("The a = " + pr.a + ";\nThe b = " + pr.b);
    }
}
