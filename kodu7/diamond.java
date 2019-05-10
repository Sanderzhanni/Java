public class diamond extends materials{
  double density, bulkMod;

  public diamond(double density, double bulkMod, double roomTemp){
    super(roomTemp);
    this.density = density;
    this.bulkMod = bulkMod;
  }

  @Override
  public double C(){
    return Math.sqrt(bulkMod / density);
  }

}//ends class
