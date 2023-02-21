package no.hvl.dat102.mengde.adt;

import org.junit.Before;
import org.junit.Test;

import no.hvl.dat102.mengde.kjedet.KjedetMengde;

import static org.junit.Assert.*;

public abstract class MengdeAdtTest {
	private MengdeADT<Integer> mengde1;
	private MengdeADT<Integer> mengde2;

	
	@Before
	
	public void setup() {
	    mengde1 = new KjedetMengde<Integer>();
	    mengde2 = new KjedetMengde<Integer>();
	    mengde1.leggTil(1);
	    mengde1.leggTil(2);
	    mengde1.leggTil(3);
	    mengde1.leggTil(4);
	    mengde1.leggTil(5);

	    
	    mengde2.leggTil(4);
	    mengde2.leggTil(5);
	    mengde2.leggTil(6);
	    mengde2.leggTil(7);
	    mengde2.leggTil(8);

	}
	
	  @Test
	  public void testUnion() {
	    // Test that the union of two sets contains all elements from both sets
	    MengdeADT<Integer> union = mengde1.union(mengde2);
	    assertTrue(union.inneholder(1));
	    assertTrue(union.inneholder(2));
	    assertTrue(union.inneholder(3));
	    assertTrue(union.inneholder(4));
	    assertTrue(union.inneholder(5));
	    assertTrue(union.inneholder(6));
	    assertTrue(union.inneholder(7));
	    assertTrue(union.inneholder(8));

	  }
	  
	  @Test
	  public void testSnitt() {
		  MengdeADT<Integer> snitt = mengde1.snitt(mengde2);
		  assertTrue(snitt.inneholder(4));
		  assertTrue(snitt.inneholder(5));

		  
	  }
	  
	  @Test
	  public void testDifferens() {
		  MengdeADT<Integer> differens = mengde1.differens(mengde2);
		  assertTrue(differens.inneholder(1));
		  assertTrue(differens.inneholder(2));
		  assertTrue(differens.inneholder(3));
		  assertFalse(differens.inneholder(4));
		  assertFalse(differens.inneholder(5));

  
	  }
	@Test
	public MengdeADT<Integer> reset() {
		// TODO Auto-generated method stub
		return null;
	}
	  
	  
	
	

}
