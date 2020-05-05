package mumbled_letters;

public class MumbledLettersShorterVer {
    public static String acuumShorterVer(String s) {
        char[] charArray = s.toLowerCase().toCharArray();
        String str = "";
        for (int i = 0; i < charArray.length; i++) {
            for (int k = 0; k < i + 1; k++) {
                if (k == 0) {
                    str += Character.toUpperCase(charArray[i]);
                } else{
                    str += charArray[i];
            }
        }
            if(i != charArray.length-1) {
                str+= "-";
            }
    }
}
