import org.junit.*;
import static org.junit.Assert.*;

public class TripsuTestid1{
	Tripsuliides laud = new Trips();


	@Test
	public void first(){
		System.out.println("Testi automaatkäivitus");
	}

	@Test
	public void alustus1(){
		laud.alusta('X');
	}

	@Test
	public void korrahaldus(){
		laud.alusta('0');
		assertEquals('0', laud.kelleKord());
		laud.paiguta(2,2);
		assertEquals('X', laud.kelleKord());
	}
	@Test
	public void v6it1(){
		laud.alusta('0');
		laud.paiguta(1,2);
		laud.paiguta(3,1);
		laud.paiguta(2,3);
		laud.paiguta(2,2);
		laud.paiguta(1,1);
		laud.paiguta(1,3);
		//assertEquals(true, laud.kontroll());
	}
	@Test
	public void salvestamine(){
		laud.paiguta(1,1);
		assertEquals(0, laud.kysi(1,1));
		laud.salvesta(1,1);
		laud.paiguta(1,2);
		laud.salvesta(1,2);
		laud.paiguta(1,3);
		laud.salvesta(1,3);
		laud.paiguta(2,1);
		laud.paiguta(2,2);
		laud.paiguta(2,3);
		laud.paiguta(3,1);
		
		
		
	}
}
