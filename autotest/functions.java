public class functions{
  public static double geomKeskmine(double[] arvud){
    
    if(arvud==null || arvud.length==0){throw new ArithmeticException("Arvud puuduvad");}

    double abi = 1;

    for(double a:arvud){
      abi*=a;
    }
    return Math.pow(abi, 1.0/arvud.length);
  }
}
