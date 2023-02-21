package no.hvl.dat102.mengde.tabell;



import no.hvl.dat102.mengde.adt.MengdeADT;
import no.hvl.dat102.mengde.adt.MengdeAdtTest;

class MengdeTabellTest extends MengdeAdtTest {


    @Override
    public MengdeADT<Integer> reset() {
        
        return new TabellMengde<Integer>();
    }

}