package moduloPractise;

public class ThreeAndFiveDividable {
    public static int sumThreeAndFiveDividable(int number) {
        int sum = 0;
        if(number < 0) {
            System.out.println("Invalid value");
            sum = -1;
        } else if (number == 0){
            sum = 0;
        } else {
            for (int i = 0; i < number; i++) {
                if ((i % 3 == 0) && (i % 5 == 0)) {
                    System.out.println("number dividable by 3 and 5: " + i);
                    sum += i;
                }
            }
        }
        System.out.println("sum of those numbers = " + sum);
        return sum;
    }

    public static void main(String[] args) {
        sumThreeAndFiveDividable(1000);
    }
}
