package tb_round_numbers;

import java.util.ArrayList;
import java.util.Random;

public class RoundAndFormatFloats {
    public static void roundAndFormatFloats() {
        Random random = new Random();
        ArrayList<Double> numbers = new ArrayList<>();
        double res = 0;

        for(double i=0; i<10; i++) {
            double d = random.nextInt(10);
            System.out.println("i = " + i + " d = "+ d );
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
        }


    }
}
