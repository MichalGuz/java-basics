package simplest;

import java.util.Random;

public class Simplest {
    public static void printEqual(int a, int b, int c) {
        if ((a < 0) || (b < 0) || (c < 0)) {
            System.out.println("Invalid Value");
        } else if ((a != b) && (a != c) && (b != c)) {
            System.out.println("All numbers are different");
        } else if ((a == b) && (a == c) && (b == c)) {
            System.out.println("All numbers are equal");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    public static double area(double radius) {
        double area = 0;
        if (radius < 0) {
            return -1;
        } else {
            area = radius * radius * Math.PI;
        }
        System.out.println("area = " + area);
        return area;
    }

    public static double area(double x, double y) {
        double area = 0;
        if (x < 0 || y < 0) {
            return -1;
        } else {
            area = x * y;
        }
        System.out.println("area = " + area);
        return area;
    }

    public static void printVariousFloats() {
        Random random = new Random();
        for(int i = 0; i < 10; i++) {
            double n = random.nextDouble();
            System.out.println("random double #" + i + " = " + n);
            double g = random.nextGaussian();
            System.out.println("random gaussian #" + i + " = " + g);
            float f = random.nextFloat();
            System.out.println("random float #" + i + " = " + f);
        }
    }

    public static void main(String[] args) {
        printEqual(22, 22, 22);
        printEqual(22, 2, 22);
        printEqual(22, 22, -22);

        area(4.5);
        area(4,5);

        printVariousFloats();
    }
}
