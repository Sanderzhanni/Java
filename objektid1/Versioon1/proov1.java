public class proov1{
  public static void main(String[] arg){
    Tegelane juku = new Tegelane();
    juku.liigu();
    juku.muudaSuund(Suund.VASAKULE);
    System.out.println(juku);
    juku.liigu();
    juku.liigu();
    System.out.println(juku);
  }
}
