package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Valuta {

	private String naziv;
	private String skraceniNaziv;
	private GregorianCalendar datum;
	LinkedList<Kurs> kursnaLista = new LinkedList<Kurs>();
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		this.skraceniNaziv = skraceniNaziv;
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		this.datum = datum;
	}
	public LinkedList<Kurs> getKursnaLista() {
		return kursnaLista;
	}
	public void setKursnaLista(LinkedList<Kurs> kursnaLista) {
		this.kursnaLista = kursnaLista;
	}
	
	

}
