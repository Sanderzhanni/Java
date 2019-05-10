import org.junit.*;
import static org.junit.Assert.*;

public class test1{
  @Test
  public void first(){
    System.out.println("Testi automaatkäivitus");
  }
  @Test
  public void arvutus1(){
    assertEquals(6, functions.geomKeskmine(new double[]{4, 9}), 0.001);
  }
  @Test
  public void arvutus2(){
    assertEquals(3, functions.geomKeskmine(new double[]{1, 3, 9}), 0.001);
  }
  @Test
  public void arvutus3(){
    assertEquals(2, functions.geomKeskmine(new double[]{1, 1, 1, 4, 8}), 0.001);
  }
  @Test
  public void arvutus4(){
    assertEquals(4, functions.geomKeskmine(new double[]{4, 4, 4, 4}), 0.001);
  }
  @Test(expected = ArithmeticException.class)
  public void arvutus5(){
    functions.geomKeskmine(new double[]{});
  }
  @Test(expected = ArithmeticException.class)
  public void arvutus6(){
    functions.geomKeskmine(null);
  }
}
