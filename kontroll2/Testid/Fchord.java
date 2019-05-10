public class Fchord extends Chords{
  String name;

  public Fchord(String name, int note){
    super(note);
    this.name=name;
  }

  public String chordPitch(int note){
    int fundamenTone = note;
    int secondNote = note + 4;
    int thirdNote = note + 7;
    //System.out.println(fundamenTone +" "+secondNote+" "+thirdNote);
    return fundamenTone + " " + secondNote +" "+ thirdNote;
  }

  public String identifyChord(Chords[] chord, String[] notes){
    String vastus = "";
    int i = 0;
    for(Chords c:chord){

      //System.out.println(c);
        System.out.println(notes[i]);

        if(notes[i].charAt(0) == 'C'){
          vastus+= "takti akkord on " + c.chordPitch(60) + "\n";
        }
        if(notes[i].charAt(0) == 'F'){
          vastus+= "takti akkord on " + c.chordPitch(65) + "\n";
        }
        if(notes[i].charAt(0) == 'G'){
          vastus+= "takti akkord on " + c.chordPitch(67) + "\n";
        }
        i++;

      }
    return vastus;
  }
}
