package moduloPractise;

public class GetLargestPrime {
    public static int getLargestPrime(int number) {
        int result = 0;
        int factor = 0;
        int counter = 0;
        int prime = 0;
        if(number <= 1) {
            System.out.println("Invalid value: " + number);
            return -1;
        } else if (number == 2) {
            System.out.println("The largest prime factor of number" + number + " is: 2");
            return 2;
        } else {
            for(int i=2; i<number; i++) {
                if (number % i == 0) {
                    factor = i;
                    for(int p=2; p<factor; p++) {
                        if(factor % p == 0) {
                            counter++;
                        }
                    }
                    if(counter == 0){
                      prime = factor;
                    }
                    counter = 0;
                }

            }
            System.out.println("The largest prime factor of number: " + number + " is " + prime);
            result = prime;
            return result;
            }
        }

    public static void main(String[] args) {
        getLargestPrime(21);
        getLargestPrime(217);
        getLargestPrime(0);
        getLargestPrime(45);
        getLargestPrime(-1);
        getLargestPrime(7);
        getLargestPrime(1);
        getLargestPrime(8);
        getLargestPrime(100);
        getLargestPrime(2);
    }
}
