public class Multi1 {
    private final int x;
    public Multi1(int x) {
        this.x = x;
    }
    public int multi1(int y) {
        return multi1(x, y);
    }
    public static int multi1(int x, int y) {
        return x * y;
    }   
}