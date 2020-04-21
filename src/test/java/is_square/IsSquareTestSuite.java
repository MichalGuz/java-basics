package is_square;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

import static is_square.SquareVerifierConcise.isSquareConcise;

public class IsSquareTestSuite {
    @Test
    public void testIsSquareConciseWithExamples() {
        // given
        int negative = -1;
        int zero = 0;
        int one = 1;
        int three = 3;
        int nine = 9;
        int sixteen = 16;
        int seventeen = 17;

        // when
        boolean checkNegative = isSquareConcise(negative);
        boolean checkZero = isSquareConcise(zero);
        boolean checkOne = isSquareConcise(one);
        boolean checkThree = isSquareConcise(three);
        boolean checkNine = isSquareConcise(nine);
        boolean checkSixteen = isSquareConcise(sixteen);
        boolean checkSeventeen = isSquareConcise(seventeen);

        // then
        Assert.assertFalse("A negative number isn't square number.", checkNegative);
        Assert.assertTrue("0 is a square number.", checkZero);
        Assert.assertTrue("1 is a square number.", checkOne);
        Assert.assertFalse("3 isn't a square number.", checkThree);
        Assert.assertTrue("9 is a square number.", checkNine);
        Assert.assertTrue("16 is a square number.", checkSixteen);
        Assert.assertFalse("17 is a square number.", checkSeventeen);
    }

    @Test
    public void testIsSquareConciseWithRandomSquareNumbers() {
        Random random = new Random();
        for(int i = 0; i < 200; i++) {
            int r = random.nextInt(2000);
            boolean result = isSquareConcise(r * r);
            System.out.println("Attempt #" + i + " - square number = " + r * r + "; result: " + result);
            Assert.assertTrue(result);
        }
    }

}
