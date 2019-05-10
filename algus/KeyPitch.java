
public class KeyPitch{
  public static double FindKeyPitch(double keyNr){
      double arvutus = (keyNr - 49) / 12;
      //System.out.println(arvutus);
      return Math.pow(2, arvutus) * 440;
      //return  (2 * ((keyNr - 49) / 12)) * 440;
    //return keyNr * 2;
  }
  public static void main(String[] arg){
    System.out.println("Helisagedus on " +FindKeyPitch(50));
  }
}
