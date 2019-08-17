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

}
