public class main{
  public static void main(String[] args){

    int fill;

    joogid j1 = new Jook(1, "Sprite", 0.50, 0.40);//id, nimi, liitriomahind, erikaal
    joogid p1 = new Joogipudel(2, 0.5, "small", 0.50, 0.20, "sprite");//id, maht, pudelityyp, mass, taarahind, jooksees
    Joogivaat v1 = new Joogivaat(250, 5);

    System.out.println("kogumass on: " + (j1.Kaal() + p1.Kaal()) + " kg");
    System.out.println("omahind on: " + (j1.omahind() + p1.omahind()) + " eurot");

    v1.fill(5);
    v1.fillFull();



  }
}
