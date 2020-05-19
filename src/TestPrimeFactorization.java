public class TestPrimeFactorization {
    public static void main(String[] args) {
        LazyPrimeFactorization num1 = new LazyPrimeFactorization();
        OptimizedPrimeFactorization num2 = new OptimizedPrimeFactorization();

        Thread thread1 = new Thread(num1);
        Thread thread2 = new Thread(num2);

        thread1.start();
        thread2.start();
    }
}
