public class InliningDemo {

    private static int add(int a, int b) {
        return a + b;
    }

    private static int calculate(int x) {
        return add(x, x + 1);
    }

    public static void main(String[] args) {
        int iterations = 50_000_000;

        long start = System.nanoTime();
        int sum = 0;
        for (int i = 0; i < iterations; i++) {
            sum += calculate(i);
        }
        long end = System.nanoTime();

        System.out.println("Результат: " + sum);
        System.out.println("Время: " + (end - start) / 1_000_000 + " ms");
        System.out.println("Итераций: " + iterations);
    }
}