package specifikacijainterfejsa;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.Kurs;

public interface Interfejs {

	public void dodajKurs(GregorianCalendar datum,String naziv,LinkedList<Kurs> kurs);
	public void obrisiKurs(GregorianCalendar datum, String naziv);
	public Kurs pronadjiKurs(GregorianCalendar datum, String naziv);
	
}
