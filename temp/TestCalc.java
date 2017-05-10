import org.junit.Test;

import static org.junit.Assert.assertEquals;
 
public class TestCalc {
    
    @Test
    public void getSumTest() {
        Calc c = new Calc();    
        assertEquals(c.getSum(20, 30), 50);
    }
        
}