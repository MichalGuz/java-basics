package switch_and_input;

public class SwitchDaysInMonths {
    public static int getDaysInMonth(int month, int year) {
        int days = 0;
        if ((month < 1) || (month > 12) || (year < 1) || (year > 9999)) {
            return -1;
        } else if (isLeapYear(year) == true) {
            switch (month) {
                case 2:
                    days = 29;
                    break;
                case 4: case 6: case 9: case 11:
                    days = 30;
                    break;
                default:
                    days = 31;
                    break;
            }
        } else if (isLeapYear(year) == false) {
            switch (month) {
                case 2:
                    days = 28;
                    break;
                case 4: case 6: case 9: case 11:
                    days = 30;
                    break;
                default:
                    days = 31;
                    break;
            }

        }
        return days;
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
