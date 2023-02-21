package no.hvl.dat102.mengdekjedet;




import no.hvl.dat102.mengde.adt.MengdeADT;
import no.hvl.dat102.mengde.adt.MengdeAdtTest;

import no.hvl.dat102.mengde.kjedet.KjedetMengde;

class MengdeKjedetTest extends MengdeAdtTest {

    
    @Override
    public MengdeADT<Integer> reset() {
        
        return new KjedetMengde<Integer>();
    }

}
