package first_attempt;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class StringSplitter {
    private static String line = "Ala ma kota, kot ma Alę";

    public static String[] strings = line.split(" ");

    public static int countStrings(){
        System.out.println(strings.length);
        return strings.length;
    }

    private static Set<String> originalStrings = Arrays.stream(strings)
            .collect(Collectors.toSet());

}
