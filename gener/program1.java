public class program1{
  public static <T> void typeArray(T[] m){
    for(T e:m){
      System.out.println(e);
    }
  }
  public static  <T> String returnArray(T[] m){
    StringBuilder sb = new StringBuilder();
    boolean start = true;
    for(T e:m){
      if(!start){sb.append(", ");}
      sb.append(e);
      start = false;
    }
    return sb.toString();
  }
  public static void main(String[] arg){
    typeArray(new String[]{"Juku", "Kati"});
    typeArray(new Integer[]{2, 1, 3});
    System.out.println(returnArray(new String[]{"Juku", "Kati"}));
  }
}
