import java.io.*;
import java.util.*;

public class Ülesanne{
  public static void main(String[] arg) throws Exception{
    int nr = 0;
    BufferedReader lugeja = new BufferedReader(new FileReader("tekstsis.txt"));
    List<String> teemad = new ArrayList<String>();
    String rida = lugeja.readLine();
    rida = lugeja.readLine();

    while(rida!=null){
      //System.out.println(rida);
      if(rida.charAt(0)!='*'){
        if(rida.charAt(1)=='a'){
          if(rida.charAt(2)=='a'){
            if(rida.charAt(3)=='s'){
              System.out.println(rida);
              teemad.add(rida);
              nr++;
            }
          }
        }
      }

    rida = lugeja.readLine();

    }

    System.out.println(teemad);
    PrintWriter kirjutaja = new PrintWriter(new FileWriter("tekstval.txt"));
    kirjutaja.println(nr);
    for(String vastus: teemad){
      kirjutaja.println(vastus);
    }
    kirjutaja.close();

  }
}
