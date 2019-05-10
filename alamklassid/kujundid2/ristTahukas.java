public class ristTahukas extends ruumilineKujund{
  double pikkus, laius;
  public ristTahukas(double pikkus, double laius, double korgus){
    super(korgus);
    this.pikkus = pikkus;
    this.laius = laius;
  }
  @Override
  public double pohjaPindala(){
    return pikkus*laius;
  }
  @Override
  public double pohjaYmbermoot(){
    return 2.0 * pikkus + 2 * laius;
  }

}//ends class
