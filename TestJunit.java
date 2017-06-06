import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
   @Test
	
   public void testAddfail() {
      String str = "Junit is not working fine";
      assertEquals("Junit is working fine",str);
   }
	 @Test
	
   public void testAddpass() {
      String str = "Junit is working fine";
      assertEquals("Junit is working fine",str);
   }
}