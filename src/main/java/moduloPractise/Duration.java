package moduloPractise;

public class Duration {
    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value.";
        }
        return "duration";
    }
}
