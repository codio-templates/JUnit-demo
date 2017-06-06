public class Calc
{
  public int getSum(int x, int y)
  {
    try {
            Thread.sleep(100);
    } catch (InterruptedException e) {
            e.printStackTrace();
    } 
    return x+y;
  }
}