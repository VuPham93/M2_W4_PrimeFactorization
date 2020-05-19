public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        for (int N = 2; N < 100; N++) {
            for (int i = 2; i <= N; i++) {
                if (N % i == 0) {
                    if (i == N) {
                        System.out.print("\nLazy prime number factorization: ");
                        System.out.print(N);
                    }
                    break;
                }
            }
        }
    }
}
