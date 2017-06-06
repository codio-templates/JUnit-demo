import org.junit.Test;

import static org.junit.Assert.assertEquals;
 
public class TestCalc1 {
    
    @Test
    public void getSumTest1() {
        Calc c = new Calc();    
        assertEquals(c.getSum(-20, 30), 10);
    }
    
     @Test
    public void getSumTest2() {
        Calc c = new Calc();    
        assertEquals(c.getSum(0, 20), 10);
    }
    
     @Test
    public void getSumTest3() {
        Calc c = new Calc();    
        assertEquals(c.getSum(10, 20), 34);
    }
    
     @Test
    public void getSumTest4() {
        Calc c = new Calc();    
        assertEquals(c.getSum(20, 20), 640);
    }
    
     @Test
    public void getSumTest5() {
        Calc c = new Calc();    
        assertEquals(c.getSum(20, 30), 50);
    }
    

    
 
}