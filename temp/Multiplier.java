public class Multiplier {
    private final int x;
    public Multiplier(int x) {
        this.x = x;
    }
    public int multiply(int y) {
        return multiply(x, y);
    }
    public static int multiply(int x, int y) {
        return x * y;
    }   
}