package dividable_by_3_or_5;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static dividable_by_3_or_5.DividableByThreeOrFive.*;

public class DividableByThreeOrFiveTestSuite {
    @Test
    public void testDividableNumbersFromRange() {
        // given
        List<Integer> testList = new ArrayList<>();
        int a = 1;
        int b= 10;

        // when
        testList = dividableNumbersFromRange(a,b);
        int counter = testList.size();
        testList.stream().map(i -> i.toString()).forEach(System.out::println);

        // then
        Assert.assertEquals(5, counter);
    }

    @Test
    public void testSumDivadableNumbersFromRange() {
        // given
        List<Integer> listOfInts = new ArrayList<>();
        for(int i = 1; i < 11; i++) {
            if ((i % 3) == 0 || (i % 5) == 0) {
                listOfInts.add(i);
            }
        }

        // when
        int n = sumDividableNumbersFromRange(listOfInts);

        // then
        Assert.assertEquals(33, n);
     }

     @Test
     public void testSumDividableNumbersBelow() {
        // given
         int number = 10;

         // when
         int sum = sumDividableNumbersBelow(number);

         // then
         Assert.assertEquals(23, sum);
    }
}

