package is_square;

import org.junit.Test;

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
    }
}
