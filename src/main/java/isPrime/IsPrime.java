package isPrime;

public class IsPrime {
    public static boolean isPrime(int number) {
        if(number < 2) {
            return false;
        }

        for(int i=2; i<=(long)Math.sqrt(number); i++) {
            if(number % i == 0) {
                return false;
            }
        }
        System.out.println(number + " is a prime number");
        return true;
    }

    public static int primeCounter(int bound) {
        int counter = 0;
        if(bound < 2) {
            return -1;
        }

        for (int i=0; i<bound; i++) {
            if(isPrime(i)) {
                counter++;
            }
        }
        System.out.println("found " + counter + " prime numbers in " + bound);
        return counter;
    }

    public static void main(String[] args) {
        primeCounter(250);
    }
}
