package boolean_letters_counter;

public class BooleanLettersCounter {
    public boolean compareAmountOfXAndOLetters(String n) {
        int xCounter = 0;
        int oCounter = 0;
        char[] letters = n.toCharArray();
        for(char let: letters) {
            if (let == 'x') {
                xCounter++;
            } if (let == 'o') {
                oCounter++;
            }
        }
        if (xCounter == oCounter) {
            return true;
        }
        return false;
    }

}
