public abstract class ruumilineKujund{
  double korgus;
  public ruumilineKujund(double korgus){
    this.korgus=korgus;
  }
  abstract double pohjaPindala();
  abstract double pohjaYmbermoot();
  public double ruumala(){
    return pohjaPindala() * korgus;
  }
  public double kylgPindala(){
    return pohjaYmbermoot() * korgus;
  }
  public double taisPindala(){
    return 2*pohjaPindala() + kylgPindala();
  }
}
