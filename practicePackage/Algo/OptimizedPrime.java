package practicePackage.Algo;


// the fundamental theorem of arithmetic, which states that every positive integer greater than 1 can be factored into a unique product of primes. 
// If a number n is not prime, then it must have a factor less than or equal to the square root of n

public class OptimizedPrime {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0) return false;
        int sqrt = (int) Math.sqrt(n);
        for (int i = 3; i <= sqrt; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(47));
    }
}
