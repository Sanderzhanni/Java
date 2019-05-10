public class air extends materials{
  double temperature;

  public air(double temperature, double roomTemp){
    super(roomTemp);
    this.temperature = temperature;
  }

  @Override
  public double C(){
    return 331.3 * Math.sqrt(1 + (temperature / 273.15));
  }

}//ends class
