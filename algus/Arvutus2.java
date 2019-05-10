public class Arvutus2{

	public static double leiaTakistus(double voimsus, double pinge){
		return pinge / leiaVool(voimsus, pinge);
	}

	public static double leiaVool(double voimsus, double pinge){
		return voimsus/pinge;
	}
	public static void main(String[] arg){
		System.out.println("Vool on "+leiaVool(40, 440));
		System.out.println("Takistus on "+leiaTakistus(30, 220));
	}
}

/* Output

[sandhan@greeny algus]$ java Arvutus2
0.13636363636363635

*/
