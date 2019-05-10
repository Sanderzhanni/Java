public class Jook extends joogid{
  String nimetus;
  Double liitriOmahind;
  double erikaal;

  public Jook(int tooteId, String nimetus, double liitriOmahind, double erikaal){
    super(tooteId);
    this.nimetus = nimetus;
    this.liitriOmahind = liitriOmahind;
    this.erikaal = erikaal;
  }

  public double Kaal(){
    return erikaal;
  }

  public double omahind(){
    return liitriOmahind;
  }
}
