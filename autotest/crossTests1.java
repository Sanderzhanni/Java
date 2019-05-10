import org.junit.*;
import static org.junit.Assert.*;

public class crossTests1{
  crossinterface table;
  @Test(expected=IllegalArgumentException.class)
  public void begin1(){
    table.begin('S');
  }
  public void turnsys(){
    table.begin('O');
    assertEquals('O', table.turn());
    table.place('O', 2, 2);
    assertEquals('X', table.turn());
  }
}
