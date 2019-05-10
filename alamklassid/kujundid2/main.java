public class main{
  public static void main(String[] args){



    /*ruumilineKujund k1 = new ristTahukas(6, 5, 3);
    System.out.println("Ruumala on: " + k1.ruumala());
    System.out.println("Pohja ymbermoot on: " + k1.pohjaYmbermoot());
    System.out.println("kylgpindala on: " + k1.kylgPindala());
    System.out.println("pohjapindala on: " + k1.pohjaPindala());
    System.out.println("taispindala on: " + k1.taisPindala());*/


    ruumilineKujund s1 = new silinder(2, 5);
    //System.out.println(s1 instanceof silinder);
    ruumilineKujund s2 = new silinder(4, 3);
    ruumilineKujund k1 = new ristTahukas(3,4,5);
    ruumilineKujund[] m ={k1, s1, s2};

    /*System.out.println("Pohja ymbermoot on: " + silinder1.pohjaYmbermoot());
    System.out.println("pohjapindala on: " + silinder1.pohjaPindala());
    System.out.println("kylgpindala on: " + silinder1.kylgPindala());
    System.out.println("taispindala on: " + silinder1.taisPindala());
    System.out.println("Ruumala on: " + silinder1.ruumala());

    System.out.println("Pohja ymbermoot on: " + silinder2.pohjaYmbermoot());
    System.out.println("pohjapindala on: " + silinder2.pohjaPindala());
    System.out.println("kylgpindala on: " + silinder2.kylgPindala());
    System.out.println("taispindala on: " + silinder2.taisPindala());
    System.out.println("Ruumala on: " + silinder2.ruumala());
    */



    System.out.println("kujundite värvikulu on: " + color.varvikulu(m, 0.5));
    System.out.println("Silindreid on kokku: " + color.silindrid(m).size());


  }
}
