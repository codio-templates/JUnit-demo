import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Multi1Tests {
    
    @Test
    public void simpleMultiply() {
        final Multi1 ml = new Multi1(5);
        assertEquals("5 x 5 must be 25", 25, ml.multi1(5));
    }
    
    @Test
    public void staticMultiply() {
        assertEquals("5 x 5 must be 25", 25, Multi1.multi1(5, 5));
        assertEquals("0 x 5 must be 0", 0, Multi1.multi1(0, 5));
        assertEquals("10 x 10 must be 100", 100, Multi1.multi1(10, 10));
    }
    
    @Test
    public void staticMultiply1() {
        assertEquals("5 x 5 must be 25", 25, Multi1.multi1(5, 5));
        assertEquals("0 x 5 must be 0", 0, Multi1.multi1(0, 5));
        assertEquals("10 x 10 must be 100", 101, Multi1.multi1(10, 10));
    }

    @Test
    public void staticMultiply2() throws Exception {
        assertEquals("5 x 5 must be 25", 25, Multi1.multi1(5, 5));
        assertEquals("0 x 5 must be 0", 0, Multi1.multi1(0, 5));
        throw new Exception("Hi");
    }
}