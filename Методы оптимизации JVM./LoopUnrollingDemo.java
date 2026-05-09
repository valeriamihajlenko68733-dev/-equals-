public class LoopUnrollingDemo {

    private static int[] array = new int[100_000];

    static {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }


    private static int loopMethod() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 20_000; i++) {
            loopMethod();
        }



    }
}