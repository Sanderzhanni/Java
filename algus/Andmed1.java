public class Andmed1{
	
	
	
		
	public static void main(String[] arg){
		int[] pikkused = new int[4];
		
		pikkused[0]=168;
		pikkused[1]=158;
		pikkused[2]=178;
		pikkused[3]=173;
		System.out.println(pikkused[pikkused.length-1]);
		System.out.println(leiaSuurim(pikkused));
		
	}
	
	public static int leiaSuurim(int[] andmed){
		int suurim = andmed[0];
		int koht = 1;
		while(koht<andmed.length){
			if(andmed[koht]>suurim){
				suurim = andmed[koht];
			}
		koht++;
		}
		return suurim;
	}
		
}
		
	