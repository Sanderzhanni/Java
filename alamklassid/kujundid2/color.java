import java.util.*;

public class color{
  static double varvikulu(ruumilineKujund k, double paksusmm){
    return k.taisPindala()*paksusmm*0.1;
  }

  static double varvikulu(ruumilineKujund[] kujund, double paksusmm){
    double summa = 0;
    for(ruumilineKujund k:kujund){
      summa+=varvikulu(k, paksusmm);
    }
    return summa;
  }
  static List<silinder> silindrid(ruumilineKujund[] kujundid){
    double max = 0;
    double ruumala = 0;
    List<silinder> vastus = new ArrayList<silinder>();
    for(ruumilineKujund k:kujundid){
      if(k instanceof silinder){
        silinder s=(silinder)k;
        //System.out.println("Raadius on: " + s.kysiRaadius());
        if(s.kysiRaadius()>max){
          max = s.kysiRaadius();
          ruumala = s.ruumala();
          ruumilineKujund maxS = (silinder)k;
        }

        vastus.add(s);

      }
    }
    System.out.println(max);
    System.out.println(ruumala);


    return vastus;
  }
}
