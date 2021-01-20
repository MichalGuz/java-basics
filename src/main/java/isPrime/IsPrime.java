package isPrime;

public class IsPrime {
    public static boolean isPrime(int number) {
        if(number < 2) {
            System.out.println(number + " is not a prime number");
            return false;
        }

        for(int i=2; i<=(long)Math.sqrt(i); i++) {
            if(number % i == 0) {
                System.out.println(number + " is not a prime number");
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
                System.out.println("prime: " + i);
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
