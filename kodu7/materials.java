public abstract class materials{
  double roomTemp; //shear modulus

  public materials(double roomTemp){
    this.roomTemp = roomTemp;
  }

  abstract double C();//speed of sound

  public double frequency(){
    return C() / 2;
  }

  public double waveLength(){
    return C() / frequency();
  }

  public double timePeriod(){
    return 2 / C();
  }

  public double waveSpeed(){
    return 2 * frequency();
  }

  public double normalAirTemp(){
    return roomTemp;
  }



}//ends class
