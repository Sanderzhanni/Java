import java.util.*;
public class program2{
  public static void main(String[] args) {
    pair<String, Integer> person1 = new pair<String, Integer>("juku", 2004);
    System.out.println(2019-person1.second + " years old");
    List<pair<String, Integer>> persons = new ArrayList<pair<String, Integer>>();
    persons.add(person1);
    persons.add(new pair<String, Integer>("Kati", 2005));
    System.out.println(persons.get(1).first);
  }
}
