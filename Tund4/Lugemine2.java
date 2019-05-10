import java.io.*;
import java.net.*;

public class Lugemine2{
  public static void main(String[] arg) throws Exception{
    Hashtable<String, TextAnd> hoidla = new Hashtable<>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(new URL("http://www.tlu.ee/~jaagup/andmed/keel/kunglarahvas_lambipirn_pikkused_haalikud.txt").openStream()));
    System.out.println(reader.readLine());
    String rida = reader.readLine();
    int counter1 = 0;
    int counter2 = 0;
    int sum = 0;
    int sum2 = 0;
    while(rida!=null){
      String[] m = rida.split(",");
      /*if(m[0].equals("kungla")){
        rida = reader.readLine();
      }
      System.out.println(m[1]+": "+m[2]);
      rida = reader.readLine();*/
        if(m[0].equals("kungla")){
          sum = sum + Integer.parseInt(m[2]);
          counter1++;
          rida = reader.readLine();
        }
        if(m[0].equals("lambipirn")){
          sum2 = sum2 + Integer.parseInt(m[2]);
          counter2++;
          rida = reader.readLine();
        }

    }
    System.out.println("kungla sonade arv: "+counter1);
    System.out.println("lambipirni sõnade arv: "+counter2);
    System.out.println("sonade keskmine tähtede arv on: "+ (sum / counter1));
    System.out.println("sonade keskmine tähtede arv on: "+ (sum2 / counter2));

  }
}
