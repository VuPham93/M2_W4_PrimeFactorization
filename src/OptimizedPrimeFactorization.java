public class OptimizedPrimeFactorization implements Runnable{
    @Override
    public void run() {

        for (int N = 2; N < 100; N++) {
            if (isPrime(N)) {
                System.out.print("\nOptimized prime number factorization: ");
                System.out.print(N);
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
