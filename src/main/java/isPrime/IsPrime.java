package isPrime;

public class IsPrime {
    public static boolean isPrime(int number) {
        if(number < 2) {
            return false;
        }

        for(int i=2; i<=(long)Math.sqrt(i); i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
