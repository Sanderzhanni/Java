public class Joogivaat{
  double ruumala;
  double jookSeesL;

    public Joogivaat(double ruumala, double jookSeesL){
      this.ruumala = ruumala;
      this.jookSeesL = jookSeesL;
    }

    public double fill(double amount){
      if(jookSeesL<ruumala){
        jookSeesL += amount;
      }

      return jookSeesL;
    }

    public double fillFull(){
      while(jookSeesL<ruumala){
        jookSeesL += 0.1;
      }
      return jookSeesL;
    }

}
