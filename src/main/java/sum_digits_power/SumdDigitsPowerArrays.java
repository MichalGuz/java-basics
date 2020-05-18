package sum_digits_power;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.fill;

public class SumdDigitsPowerArrays {
    public static List<Long> sumDigitsPower(long a, long b) {
        long[] inputArray = new long[(int)((b-a)+1L)];
        long[] output = new long[(int)((b-a)+1L)];
        long[] poweredInts = new long[(int)((b-a)+1L)];;

        int index1 = 0;
        for (long i = a; i < b + 1; i++) {
            fill(inputArray, index1, index1+1, i);
            System.out.println("i = " + i);
            index1++;
        }
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int index2 = 0;
        for (long x : inputArray) {
            long temp = 0;
            double poweredTemp = 0;
            long sum = 0;
            String tempStr = "";
            do {
                tempStr = Integer.toString((int) x);
                temp = x % 10;
                poweredTemp = Math.pow(temp, tempStr.length());
                sum += poweredTemp;
                x /= 10;
            } while (x >=1);
            fill(poweredInts, index2, index2+1, sum);
            index2++;
        }
        System.out.println("powered = " + Arrays.toString(poweredInts));

        for (int y = 0; y < inputArray.length; y++) {
            // objects: ar1, ar2, deepAr1, deepAr2 contains only one element
            Object[] ar1 = {inputArray[y]};
            Object[] ar2 = {poweredInts[y]};
            Object[] deepAr1 = {ar1};
            Object[] deepAr2 = {ar2};
            if (Arrays.deepEquals(deepAr1,deepAr2) && inputArray[y] != 0){
                long q = inputArray[y];
                fill(output, y, y+1, q);
            }
        }

        long[] outputf = Arrays.stream(output).filter(elem -> elem != 0).toArray();
        Long[] casted = new Long[outputf.length];
        int cnt = 0;
        

        List<Long> list = new ArrayList<>();
        return list;
    }

    public static void main(String[] args) {
        sumDigitsPower(1, 6);
    }
}