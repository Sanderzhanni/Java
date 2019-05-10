import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
import java.net.*;

public class Draw2{
  public static void main(String[] arg) throws Exception{
    BufferedImage bi = new BufferedImage(1000, 500, BufferedImage.TYPE_INT_RGB);
    BufferedReader reader = new BufferedReader(new InputStreamReader(new URL("http://www.tlu.ee/~jaagup/andmed/keel/kunglarahvas_lambipirn_pikkused_haalikud.txt").openStream()));
    reader.readLine();
    Graphics g = bi.createGraphics();
    g.setColor(Color.WHITE);
    int koef = 120;
    int counter = 500;

    for(int i =0;counter != 0;i++){
      String[] m = reader.readLine().split(",");
      if(m[0].equals("lambipirn")){
        counter--;
          //System.out.println("OK");

        g.drawString(m[1], koef * Integer.parseInt(m[3]), koef * Integer.parseInt(m[4]) + (int)(koef/1.2*Math.random()));
      }
    }
    ImageIO.write(bi, "png", new File("Pilt2.png"));
  }
}
