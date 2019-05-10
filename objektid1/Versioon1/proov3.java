import java.util.Scanner;

public class proov3{
  public static void main(String[] arg){
    Tegelane juku = new Tegelane();
    Tegelane kati = new Tegelane();

    //System.out.println(juku);
    //System.out.println(kati);

    while(juku.kaugus(kati) != 0){
      Scanner reader = new Scanner(System.in);
      System.out.println(juku);
      System.out.println("Juku liikumise suund[P,Y,V,A]");
      String sisend = reader.nextLine();
      if(sisend.equals("P")){
        juku.muudaSuund(Suund.PAREMALE);
        juku.liigu();
      }else{
        if(sisend.equals("Y")){
          juku.muudaSuund(Suund.YLES);
          juku.liigu();
        }else{
            if(sisend.equals("V")){
              juku.muudaSuund(Suund.VASAKULE);
              juku.liigu();
            }else{
              if(sisend.equals("A")){
                juku.muudaSuund(Suund.ALLA);
                juku.liigu();
              }
            }
        }
      }

      Scanner reader2 = new Scanner(System.in);
      System.out.println(kati);
      System.out.println("Kati liikumise suund[P,Y,V,A]");
      String sisend2 = reader2.nextLine();
      if(sisend2.equals("P")){
        kati.muudaSuund(Suund.PAREMALE);
        kati.liigu();
      }else{
        if(sisend2.equals("Y")){
          kati.muudaSuund(Suund.YLES);
          kati.liigu();
        }else{
            if(sisend2.equals("V")){
              kati.muudaSuund(Suund.VASAKULE);
              kati.liigu();
            }else{
              if(sisend2.equals("A")){
                kati.muudaSuund(Suund.ALLA);
                kati.liigu();
              }
            }
        }
      }
      //System.out.println(kati);
    }
    System.out.println("MÄNG LÄBI!");

    System.out.println(juku);
    System.out.println(kati);
    //System.out.println(juku.kaugus(kati));
  }
}
