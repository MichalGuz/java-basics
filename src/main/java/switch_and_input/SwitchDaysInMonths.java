package switch_and_input;

public class SwitchDaysInMonths {
    public static int getDaysInMonth(int month, int year) {
        int days = 0;
        if ((month < 1) || (month > 12) || (year < 1) || (year > 9999)) {
            System.out.println("Invalid vaule of month or year");
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
        System.out.println("The " + month + "th month of " + year + " year is " + days + " days long");
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

    public static void main(String[] args) {
        System.out.println("Is leap year: 1990 - " + isLeapYear(1990));
        System.out.println("Is leap year: 1900 - " + isLeapYear(1900));
        System.out.println("Is leap year: 1902 - " + isLeapYear(1902));
        System.out.println("Is leap year: 2000 - " + isLeapYear(2000));
        System.out.println("Is leap year: 2020 - " + isLeapYear(2020));

        getDaysInMonth(2,1888);
        getDaysInMonth(10, 1900);
        getDaysInMonth(2, 1999);
        getDaysInMonth(13, 1112);
    }
}
