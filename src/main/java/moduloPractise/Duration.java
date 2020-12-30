package moduloPractise;

public class Duration {
    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value.";
        }
        int hours = minutes / 60;
        minutes %= 60;
        String h;
        String m;
        String s;
        if (hours < 10) {
            h = "0" + hours;
        } else {
            h = "" + hours;
        }

        if (minutes < 10) {
            m = "0" + minutes;
        } else {
            m = "" + minutes;
        }

        return  h + " h : " + m + "m ";
    }
}
