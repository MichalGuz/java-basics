package mumbled_letters;

public class MumbledLettersWithStringBuilder {
    public static String accumStringBuild(String s) {
        StringBuilder bldr = new StringBuilder();
        int i = 0;
        for(char c : s.toCharArray()) {
            if(i > 0) bldr.append('-');
            bldr.append(Character.toUpperCase(c));
        }
    }
}
