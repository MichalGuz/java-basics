package is_permutation;

import java.util.Arrays;

public class CompareStrings {
    public boolean isPermutation(String firstString, String secondString){
        char [] one = new char[firstString.length()];
        char [] two = new char[secondString.length()];

        int controlOne = firstString.length();
        int controlTwo = secondString.length();

        one = firstString.toCharArray();
        two = secondString.toCharArray();
        if(controlOne != controlTwo){
            return false;
        }

        Arrays.sort(one);
        Arrays.sort(two);
        for (int i = 0; i< one.length; i++)
            if (one[i] != two[i]) {
                return false;
            }

        return true;
    }

    void result(String stringOne, String stringTwo) {
        if(isPermutation(stringOne, stringTwo) == false){
            System.out.println("No!");
        } else {
            System.out.println("Yes.");
        }
    }
}
