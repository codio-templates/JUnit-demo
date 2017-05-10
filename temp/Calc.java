public class Calc
{
  public int getSum(int x, int y)
  {
    try {
            Thread.sleep(1000);
    } catch (InterruptedException e) {
            e.printStackTrace();
    } 
    return x+y;
  }
}