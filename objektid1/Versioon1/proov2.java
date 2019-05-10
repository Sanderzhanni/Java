public class proov2{
  public static void main(String[] arg){
    Tegelane juku = new Tegelane();
    Tegelane kati = new Tegelane();
    juku.muudaSuund(Suund.YLES);
    juku.liigu();
    juku.liigu();
    juku.liigu();
    kati.muudaSuund(Suund.PAREMALE);
    kati.liigu();
    kati.liigu();
    System.out.println(juku);
    System.out.println(kati);
    System.out.println(juku.kaugus(kati));
  }
}
