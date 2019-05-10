public class silinder extends ruumilineKujund{
  double raadius, korgus;
  public silinder(double raadius, double korgus){
    super(korgus);
    this.raadius = raadius;
  }

  @Override
  public double pohjaPindala(){
    return raadius * raadius * Math.PI;
  }

  @Override
  public double pohjaYmbermoot(){
    return 2 * Math.PI * raadius;
  }
  public double kysiRaadius(){
    return raadius;
  }
  public double kysiKorgus(){
    return korgus;
  }

}
