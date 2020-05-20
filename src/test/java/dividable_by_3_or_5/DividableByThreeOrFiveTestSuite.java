package dividable_by_3_or_5;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static dividable_by_3_or_5.DividableByThreeOrFive.dividableNumbersFromRange;

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

        // then
        Assert.assertEquals(5, counter);

    }
}
