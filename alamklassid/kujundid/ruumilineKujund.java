public abstract class ruumilineKujund{
  double korgus;
  public ruumilineKujund(double korgus){
    this.korgus=korgus;
  }
  abstract double pohjaPindala();
  public double ruumala(){
    return pohjaPindala() * korgus;
  }
}
