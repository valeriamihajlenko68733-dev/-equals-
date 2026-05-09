public class EscapeDemo {

    static class Point {
        int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    // Объект НЕ убегает (NoEscape)
    private static int testNoEscape() {
        Point p = new Point(10, 20);
        return p.x + p.y;      // p не возвращается, не сохраняется
    }

    public static void main(String[] args) {
        for (int i = 0; i < 200000; i++) {
            testNoEscape();
        }
    }
}