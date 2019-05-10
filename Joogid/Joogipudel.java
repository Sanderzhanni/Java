public class Joogipudel extends joogid{
  double maht;
  String pudelityyp;
  double mass;
  double taaraHind;
  String jookSees;

  public Joogipudel(int tooteId, double maht, String pudelityyp, double mass, double taaraHind, String jookSees){
    super(tooteId);
    this.maht = maht;
    this.pudelityyp = pudelityyp;
    this.mass = mass;
    this.taaraHind = taaraHind;
    this.jookSees = jookSees;
  }

  public double Kaal(){
    return mass;
  }

  public double omahind(){
    return taaraHind;
  }

}
