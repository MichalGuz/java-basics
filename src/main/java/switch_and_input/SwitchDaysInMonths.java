package switch_and_input;

public class SwitchDaysInMonths {
    public static int getDaysInMonth(int month, int year) {
        int days = 0;
        if ((month < 1) || (month > 12) || (year < 1) || (year > 9999)) {
            return -1;
        }
        return -1;
    }

    public static boolean isLeapYear(int year) {
        if(year < 1 || year > 9999) {
            return false;
        } else if (year % 4 == 0) {
            if((year % 100 != 0) || (year % 400 == 0)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
