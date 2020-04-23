package boolean_letters_counter;

public class BooleanLettersCounter {
    public boolean compareAmountOfXAndOLetters(String n) {
        int xCounter = 0;
        int oCounter = 0;
        char[] letters = n.toCharArray();
        for(char let: letters) {
            if (let == 'x' || let == 'X' ) {
                xCounter++;
            } else if (let == 'o' || let == 'O') {
                oCounter++;
            }
        }
        return xCounter == oCounter;
    }

}
