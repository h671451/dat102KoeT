package Oppg2;

import no.hvl.dat102.mengde.adt.MengdeADT;
import no.hvl.dat102.mengde.kjedet.KjedetMengde;

public class KlientProgramMedlem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MengdeADT<Hobby> hobbyer = new KjedetMengde<>();
        hobbyer.leggTil(new Hobby("gaming"));
        hobbyer.leggTil(new Hobby("training"));
        
		
		Medlem m1 = new Medlem("Dat",hobbyer, 1);
		
		System.out.print(m1.toString());
	}

}
