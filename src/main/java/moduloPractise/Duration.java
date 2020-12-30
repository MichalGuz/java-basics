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

        if (seconds < 10) {
            s = "0" + seconds;
        } else {
            s = "" + seconds;
        }
        return  h + " h : " + m + "m : " + s + "s";
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value.";
        }
        int min = seconds / 60;
        int sec = seconds % 60;

        return getDurationString(min, sec);
    }
}
