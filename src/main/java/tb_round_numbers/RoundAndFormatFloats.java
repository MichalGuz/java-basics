package tb_round_numbers;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RoundAndFormatFloats {
    public static ArrayList<Double> roundFloats() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer from range 1-20");
        int enteredValue = scanner.nextInt();
        scanner.close();

        Random random = new Random();
        ArrayList<Double> numbers = new ArrayList<>();
        double res = 0;

        for (double i = 0; i < enteredValue; i++) {
            double d = random.nextInt(enteredValue);
            System.out.println("i = " + i + " d = " + d);
            if (d <= 1) {
                res = (i / 1) / 4;
            } else {
                res = (i / d) / 4;
            }

            System.out.println(String.format("%.2f", res));
            System.out.println(String.format("%.4f", res));
            System.out.println(String.format("%.6f", res));
            System.out.println(String.format("%.10f", res));
            System.out.println(String.format("%.15f", res));
            numbers.add(res);
        }
        return numbers;
    }

    public static void formatFloats(ArrayList<Double> listOfFloats) {
    }
}
