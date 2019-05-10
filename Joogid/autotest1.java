import org.junit.*;
import static org.junit.Assert.*;

public class autotest1{

  @Test
  public void first(){
    System.out.println("Testi automaatkäivitus");
  }

  @Test
public void arvutus1(){
  assertEquals(10, Joogivaat.fill(new double[]), 0.001);
}


}
