package specifikacijainterfejsa;

import java.util.GregorianCalendar;

import menjacnica.Kurs;

public interface Interfejs {

	public void dodajKurs(GregorianCalendar datum,String naziv,Kurs kurs);
	public void obrisiKurs(GregorianCalendar datum, String naziv);
	public Kurs pronadjiKurs(GregorianCalendar datum, String naziv);
	
}
