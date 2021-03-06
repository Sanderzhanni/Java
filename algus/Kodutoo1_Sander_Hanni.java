import java.util.Scanner;

public class Kodutoo1_Sander_Hanni{

  public static double FindKeyPitch(double keyNr){
      double arvutus = (keyNr - 49) / 12;
      //System.out.println(arvutus);
      return Math.pow(2, arvutus) * 440;
      //return  (2 * ((keyNr - 49) / 12)) * 440;
    //return keyNr * 2;
  }
  public static void main(String[] args){

    /*Muutujad*/
    int n = 0;
    int t = 1;
    int nr = 49;
    double[] klahvid = new double[13];
    double newPitch = 0;
    double startInt = 415.3047; //Alustame klahvi C4 juurest, millest võtame 1 tooni võrra väiksema sageduse
    boolean noTrnp = false;

    /*User input*/
    Scanner reader2 = new Scanner(System.in);  // Reading from System.in

    System.out.println("Enter: key number to find out its original pitch");
    nr = reader2.nextInt();

    Scanner reader = new Scanner(System.in);
    System.out.println("Enter: 0 for transposing DOWN / 1 for transposing UP / ANY other NUMBER to not transpose the pitches");
    n = reader.nextInt();
    //System.out.println("\n");
    if(n > 1){
      System.out.println("Entered number is not 0 or 1, pitches will not be transposed\n");
    }else{
      System.out.println("Enter: how many tones do you want to transpose / (MAX is 5)");
      t = reader.nextInt();
      //System.out.println("\n");
      if(t >= 6){
          System.out.println("Number entered is bigger than 5, pitches will NOT be transposed\n");
          noTrnp = true;//NoTranspose
      }else{
        if(t < 1){
          System.out.println("Number entered is smaller than 1, pitches will NOT be transposed\n");
          noTrnp = true;
        }
      }

      //once finished
      reader.close();
    }

    /*sageduste arvutamine*/
    for(int m=0; m<t; m++){
      if(n == 0){

          klahvid[0] = 	startInt / Math.pow(2, 1.0 / 12.0); //Hz - Hertsi(Hertz)

          newPitch = klahvid[0];
          startInt = newPitch;
          //System.out.println("null"); #Debugging
          //System.out.println(klahvid[0]);

      }else{
        if(n == 1){
          klahvid[0] = startInt	 * Math.pow(2, 1.0 / 12.0); //Hz - Hertsi(Hertz)

          newPitch = klahvid[0];
          startInt = newPitch;
            //System.out.println(klahvid[0]);
          //System.out.println("yks");
        }else{
          klahvid[0] = startInt; //Hz - Hertsi(Hertz)
            //System.out.println(klahvid[0]);
          //System.out.println("tyhi");
        }
      }
    }

    //Kui transponeerimist ei toimu
    if(noTrnp == true){
        klahvid[0] = 415.3047;
    }

    //Toome vastused välja
    for(int i=1; i<13; i++){

      klahvid[i] = klahvid[i-1] * Math.pow(2, 1.0 / 12.0);
      int klahvNr = i + 48;
      System.out.println("key number " + klahvNr + " hertz frequency is " + klahvid[i]);



    }

    System.out.println("Sisestatud klahvi "+nr+" originaalne helisagedus on "+FindKeyPitch(nr));



    //System.out.println(klahvid[5]); #Debugging
  }
}

//töö koostamiseks kasutatud veebilehte https://en.wikipedia.org/wiki/Piano_key_frequencies
