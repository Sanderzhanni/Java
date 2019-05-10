import java.util.concurrent.ThreadLocalRandom;

class player implements action{

  public int playerHealth = 100;
  public int enemyHealth = 100;
  public int normalAttack = 15;
  public int criticalAttack = 30;

  public player(){
    playerHealth = 100;
  }

  public void attackCritical(){
    int x = ThreadLocalRandom.current().nextInt(1, 100);
    System.out.println(x);
    if(x>50){
      System.out.println("Onnestus");

      if(enemyHealth>0)
      {
        enemyHealth = enemyHealth - criticalAttack;
        System.out.println("Vastasel on elusid alles: "+enemyHealth);
      }
      else
      {
        System.out.println("vastane on surnud");
      }
    }

    if(x<=50){
      System.out.println("ei Onnestunud");
      {
        if(playerHealth>0)
        {
          playerHealth = playerHealth - 25;
          System.out.println("M'ngijal on elusid alles: "+playerHealth);
        }
        else
        {
          System.out.println("M'ngija on surnud");
          normalAttack = 0;
        }
      }
    }
  }

  public void attackNormal(){
    int x = ThreadLocalRandom.current().nextInt(1, 100);
    System.out.println(x);
    if(x>30){
      System.out.println("Onnestus");

      if(enemyHealth>0)
      {
        enemyHealth = enemyHealth - normalAttack;
        System.out.println("Vastasel on elusid alles: "+enemyHealth);
      }
      else
      {
        System.out.println("vastane on surnud");
      }
    }

    if(x<=30){
      System.out.println("ei Onnestunud");
      {
        if(playerHealth>0)
        {
          playerHealth = playerHealth - 25;
          System.out.println("M'ngijal on elusid alles: "+playerHealth);
        }
        else
        {
          System.out.println("M'ngija on surnud");

        }
      }
    }
  }




}
