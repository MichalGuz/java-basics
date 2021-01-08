package moduloPractise;

public class PrintYearsAndDays {
    public static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.println("Invalid value");
        } else {
            long days = minutes / (60 * 24);
            long years;
            if(days > 0) {
                years = days / 365;
                days = days % 365;
            }
        }

    }
}
