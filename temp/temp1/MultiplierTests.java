import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplierTests {
    
    @Test
    public void simpleMultiply() {
        final Multiplier ml = new Multiplier(5);
        assertEquals("5 x 5 must be 25", 25, ml.multiply(5));
    }
    
    @Test
    public void staticMultiply() {
        assertEquals("5 x 5 must be 25", 25, Multiplier.multiply(5, 5));
        assertEquals("0 x 5 must be 0", 0, Multiplier.multiply(0, 5));
        assertEquals("10 x 10 must be 100", 100, Multiplier.multiply(10, 10));
    }
    
    @Test
    public void staticMultiply1() {
        assertEquals("5 x 5 must be 25", 25, Multiplier.multiply(5, 5));
        assertEquals("0 x 5 must be 0", 0, Multiplier.multiply(0, 5));
        assertEquals("10 x 10 must be 100", 101, Multiplier.multiply(10, 10));
    }

    @Test
    public void staticMultiply2() throws Exception {
        assertEquals("5 x 5 must be 25", 25, Multiplier.multiply(5, 5));
        assertEquals("0 x 5 must be 0", 0, Multiplier.multiply(0, 5));
        throw new Exception("Hi");
    }
    @Test
    public void staticMultiply3() throws Exception {
        assertEquals("5 x 5 must be 25", 25, Multiplier.multiply(5, 5));
        assertEquals("0 x 5 must be 0", 0, Multiplier.multiply(0, 5));
        throw new Exception("Hi");
    }
    @Test
    public void staticMultiply4() throws Exception {
        assertEquals("5 x 5 must be 25", 25, Multiplier.multiply(5, 5));
        assertEquals("0 x 5 must be 0", 0, Multiplier.multiply(0, 5));
        throw new Exception("Hi");
    }
    @Test
    public void staticMultiply5() throws Exception {
        assertEquals("5 x 5 must be 25", 25, Multiplier.multiply(5, 5));
        assertEquals("0 x 5 must be 0", 0, Multiplier.multiply(0, 5));
        throw new Exception("Hi");
    }
    @Test
    public void staticMultiply6() throws Exception {
        assertEquals("5 x 5 must be 25", 25, Multiplier.multiply(5, 5));
        assertEquals("0 x 5 must be 0", 0, Multiplier.multiply(0, 5));
        throw new Exception("Hi");
    }
    @Test
    public void staticMultiply7() throws Exception {
        assertEquals("5 x 5 must be 25", 25, Multiplier.multiply(5, 5));
        assertEquals("0 x 5 must be 0", 0, Multiplier.multiply(0, 5));
        throw new Exception("Hi");
    }
    @Test
    public void staticMultiply8() throws Exception {
        assertEquals("5 x 5 must be 25", 25, Multiplier.multiply(5, 5));
        assertEquals("0 x 5 must be 0", 0, Multiplier.multiply(0, 5));
        throw new Exception("Hi");
    }
    
}