public class rubber extends materials{
  double density, bulkMod;

  public rubber(double density, double bulkMod, double roomTemp){
    super(roomTemp);
    this.density = density;
    this.bulkMod = bulkMod;
  }

  @Override
  public double C(){
    return Math.sqrt(bulkMod / density);
  }

}//ends class
