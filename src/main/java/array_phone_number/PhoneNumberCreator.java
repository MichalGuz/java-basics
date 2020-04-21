package array_phone_number;

public class PhoneNumberCreator {
    String number = "";
    public String createPhoneNumber(int[] n) {
        for(int num: n) {
            number = number + num;
        }
        number = "(" + number.substring(0,3) + ") " + number.substring(3,6) + "-" + number.substring(6,9);
        System.out.println(number);
    }
}
