package Oppg2;

import no.hvl.dat102.mengde.adt.MengdeADT;

public class Medlem {
	private String navn; 
	private MengdeADT<Hobby> hobbyer;  
	private int statusIndeks; 
	//... Konstruktør 
	//... Andre metoder 
	public Medlem(String navn, MengdeADT<Hobby> hobbyer, int statusIndeks) {
		super();
		this.navn = navn;
		this.hobbyer = hobbyer;
		this.statusIndeks = statusIndeks;
	}
	public String getNavn() {
		return navn;
	}
	public void setNavn(String navn) {
		this.navn = navn;
	}
	
	public MengdeADT<Hobby> getHobbyer() {
		return hobbyer;
	}
	public void setHobbyer(MengdeADT<Hobby> hobbyer) {
		this.hobbyer = hobbyer;
	}
	
	public int getStatusIndeks() {
		return statusIndeks;
	}
	public void setStatusIndeks(int statusIndeks) {
		this.statusIndeks = statusIndeks;
	}
	
	public boolean passerTil(Medlem medlem2) {
        
        // Henter hobbyene til begge medlemmene
       MengdeADT<Hobby> hobby1 = this.getHobbyer();
       MengdeADT<Hobby> hobby2 = medlem2.getHobbyer();
       
       // Sjekker om medlemmene har samme antall hobbyer
       if (hobby1.antall() != hobby2.antall()) {
           return false;
       }
       
       // Sjekker om medlemmene har eksakt samme hobbyer
       for (Hobby hobby : hobby1) {
           if (!hobby2.inneholder(hobby)) {
               return false;
           }
       }
       
       return true;
   }
	
	public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Member name: " + navn + "\n");
        sb.append("Hobbies: ");
        for (Hobby hobby : hobbyer) {
            sb.append(hobby.toString() + " ");
        }
        sb.append("\nStatusindeks: " + statusIndeks);
        return sb.toString();
    }
	
	

}
