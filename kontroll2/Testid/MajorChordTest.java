import org.junit.*;
import static org.junit.Assert.*;
//javac -cp junit4.jar:. fileName.java
//java -cp junit4.jar:. org.junit.runner.JUnitCore fileName

public class MajorChordTest{

  @Test
  public void first(){
    System.out.println("Testi automaatkäivitus");
  }

  @Test
  public void findKeyPitchTest1(){
    int notePitch = 60;
    assertEquals(notePitch + (notePitch + 4) + (notePitch + 7), MajorChord.findKeyPitch(notePitch), 0.001);
  }

  @Test
  public void findKeyPitchTest2(){
    int notePitch = 120;
    assertEquals(notePitch + (notePitch + 4) + (notePitch + 7), MajorChord.findKeyPitch(notePitch), 0.001);
  }

}
