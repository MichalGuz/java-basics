package smallest_difference;

public class DifferenceArray {
    int[] ints = {4,2,4,1,1};

    int[] diffs = new int[25];

    int[] coutnDiffs(){
        int tempValue;
        for (int i = 0; i < ints.length; i++) {
            tempValue = ints[i];
            for (int j = 0; j < ints.length; j++) {
                int diff = tempValue - ints[j];
                if(diff >= 0) {
                    diffs[j] = diff;
                }
            }
        }
        return diffs;
    }
}
