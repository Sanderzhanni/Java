public class Sisend{
	
	
	public static void main(String[] argumendid){
		int summa = 0;
		int arv = 0;
		System.out.println("Argumente: "+argumendid.length);
		for(int i=0; i<argumendid.length; i++){
			System.out.println(argumendid[i]);
		}
		for(int i=0; i<argumendid.length; i++){
			System.out.println(argumendid[i].substring(0, 1)+" "+argumendid[i].length());
			arv = argumendid[i].length();
			summa = arv + summa;
			
		}System.out.println("Stringi pikkus on: "+summa);
		
	}
	
}