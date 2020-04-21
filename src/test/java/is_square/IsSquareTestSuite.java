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
        Assert.assertEquals("A negative number isn't square number.", false, checkNegative);
        Assert.assertEquals("0 is a square number.", true, checkZero);
        Assert.assertEquals("1 is a square number.", true, checkOne);
        Assert.assertEquals("3 isn't a square number.", false, checkThree);
        Assert.assertEquals("9 is a square number.", true, checkNine);
        Assert.assertEquals("16 is a square number.", true, checkSixteen);
        Assert.assertEquals("17 is a square number.", false, checkSeventeen);
    }

    @Test
    public void testIsSquareConciseWithRandomSquareNumbers() {
        Random random = new Random();
        for(int i = 0; i < 200; i++) {
            int r = random.nextInt(2000);
        }
    }

}
