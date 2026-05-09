public class DeadCodeDemo {

    private static int withDeadCode(int x) {
        int result = x + 100;

        // Мёртвый код — вычисления, которые никогда не выполнятся
        if (false) {
            long heavy = 0;
            for (int i = 0; i < 1_000_000_000; i++) {
                heavy += i * i * i;
                heavy = heavy / 2;
                heavy = heavy * 3;
            }
            int dead = (int) Math.sqrt(heavy);
        }

        return result;
    }

    private static int withoutDeadCode(int x) {
        return x + 100;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20000; i++) {
            withDeadCode(i);
            withoutDeadCode(i);
        }
    }
}