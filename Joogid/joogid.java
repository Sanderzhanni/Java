public abstract class joogid{
  double kogumass;
  double koguOmahind;
  int tooteId;

  public joogid(int tooteId){
    this.tooteId = tooteId;
  }

  //abstract double pudeliKaal();
  abstract double Kaal();
  abstract double omahind();

  public double kogumass(){
    return Kaal() * 2;
  }
}
