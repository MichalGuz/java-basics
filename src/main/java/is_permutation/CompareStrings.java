package is_permutation;

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

        return true;
    }
}
