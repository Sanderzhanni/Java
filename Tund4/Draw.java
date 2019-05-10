import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;


public class Draw{
  public static void main(String[] arg) throws Exception{
    BufferedImage bi = new BufferedImage(400, 300, BufferedImage.TYPE_INT_RGB);
    Graphics g = bi.createGraphics();
    g.setColor(Color.WHITE);
    g.fillRect(0,0,400,300);
    g.setColor(Color.RED);
    //keha
    g.drawLine(100,80,100,150);
    //jalad
    g.drawLine(100,150,130,220);
    g.drawLine(100,150,70,220);
    //käed
    g.drawLine(100,80,130,150);
    g.drawLine(100,80,70,150);
    //saapad
    g.setColor(Color.BLACK);
    g.fillRect(130,220,15,10);
    g.fillRect(55,220,15,10);
    //Pea
    g.setColor(Color.RED);
    g.drawOval(85,50, 30, 30);
    //silmad
    g.setColor(Color.BLACK);
    g.drawOval(87,60, 5, 5);
    g.drawOval(97,60, 5, 5);
    //rusikad
    g.setColor(Color.BLACK);
    g.fillOval(125,145, 10, 10);
    g.fillOval(65,145, 10, 10);
    //suu
    g.drawLine(90,70, 100, 70);
    //juuksed
    g.setColor(Color.ORANGE);
    for(int i=0;i<10;i++){
      g.drawLine(95+(i*2),55, 80+(i*5), 40);
    }


    ImageIO.write(bi, "png", new File("Pilt1.png"));
  }
}
