package array_phone_number;

public class PhoneNumberCreator {
    String number = "";
    public String createPhoneNumber(int[] n) {
        for(int num: n) {
            number = number + num;
        }
        number = "(" + number.substring(0,3) + ") " + number.substring(3,6) + "-" + number.substring(6,9);
        System.out.println(number);
        return number;
    }

    public static void main(String[] args) {
        PhoneNumberCreator test = new PhoneNumberCreator();
        int[] digits = {6,6,5,4,5,5,6,6,6};
        test.createPhoneNumber(digits);
    }
}
