package moduloPractise;

public class ThreeAndFiveDividable {
    public static int sumThreeAndFiveDividable(int number) {
        int sum = 0;
        if(number < 0) {
            System.out.println("Invalid value");
            sum = -1;
        }
        for (int i=0; i<number; i++) {
            if((i % 3 == 0) && (i % 5 == 0)) {
                sum += i;
            }
        }
        return sum;
    }
}
