import java.util.*;
public class speed{

  static double speed(materials m){
    return  m.C() / 343;
  }

  static List<materials> faster(materials[] material){
    List<materials> answer = new ArrayList<materials>();
      for(materials m:material){
        if(speed(m) > 0){
          materials s=(materials)m;
          answer.add(s);
        }
      }
      return answer;
    }

}//ends class
