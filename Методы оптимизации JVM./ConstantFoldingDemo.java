public class ConstantFoldingDemo {

    private static int test() {
        int a = 10;
        int b = 20;
        int c = 5;
        return a * b + c;   // 10 * 20 + 5 = 205
    }

    public static void main(String[] args) {
        // Прогрев
        for (int i = 0; i < 20000; i++) {
            test();
        }

        // Вызов после прогрева (JIT уже скомпилировал)
        test();
    }
}