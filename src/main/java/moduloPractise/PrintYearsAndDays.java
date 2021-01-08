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
            } else {
                days = 0;
                years = 0;
            }
            System.out.println(minutes + " min = " + years + " y and " + days + " d");        }
    }

    public static void main(String[] args) {
        printYearsAndDays(0);
        printYearsAndDays(6785);
        printYearsAndDays(362543);
        printYearsAndDays(8623499);
    }
}
