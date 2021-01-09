package moduloPractise;

public class GetLargestPrime {
    public static int getLargestPrime(int number) {
        int result = 0;
        int factor = 0;
        if(number <= 1) {
            System.out.println("Invalid value: " + number);
            return -1;
        } else if (number == 2){
            System.out.println("The largest prime factor of number" + number + " is: 2");
            return 2;
            }
        return result;
    }
}
