public class program{
  public static void main(String[] args) {
    materials steel = new steel(7.600, 23.2 * Math.pow(10, 6), 20);
    materials rubber = new rubber(1.2, 0.22 * Math.pow(10, 6), 20);
    materials diamond = new diamond(3, 64 * Math.pow(10, 6), 20);
    materials air = new air(20, 20);

    materials[] m ={steel, rubber, diamond, air};

    System.out.println("Speed of sound  in steel is: " + steel.C()+" m/s");
    System.out.println("Speed of sound  in rubber is: " + rubber.C()+" m/s");
    System.out.println("Speed of sound  in diamond is: " + diamond.C()+" m/s");
    System.out.println("Air temperature used is: " + air.normalAirTemp()+ " Celcius");
    System.out.println("Speed of sound  in air is: " + air.C()+" m/s");
    System.out.println("Frequency in air is: " + air.frequency()+" ms");
    System.out.println("waveLength in air is: " + air.waveLength()+" m");
    System.out.println("Timeperiod in air is: " + air.timePeriod()+" ms");
    System.out.println("Wavespeed in air is: " + air.waveSpeed()+" m/s");

    System.out.println("Materials are faster than normal speed of sound: " + speed.faster(m));
  }
}//ends class

//steel bulk mod is 200 and density is 7860 kg/m3, g = 79.3
