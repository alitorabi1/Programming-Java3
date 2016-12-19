package review02primes;

public class Review02Primes {

    static boolean isPrime(long value) {
        for (int i = 2; i <= value / 2; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // TODO: print out, in a single line, comma-separated
        // all prime numbers from 1-100 inclusive
        for (int i = 1; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.printf("%d, ", i);
            }
        }
    }

}
