package specifikacijainterfejsa;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.Kurs;
import menjacnica.Valuta;

public class ImplementacijaInterfejsa implements Interfejs {
	
	LinkedList<Valuta> valute = new LinkedList<Valuta>();

	public void dodajKurs(GregorianCalendar datum, String naziv,
			LinkedList<Kurs> kurs) {
		for(int i=0;i<valute.size();i++)
			if(valute.get(i).getNaziv().equals(naziv)){
				valute.get(i).setKursnaLista(kurs);
				valute.get(i).setDatum(datum);
			}

	}

	public void obrisiKurs(GregorianCalendar datum, String naziv) {
		for(int i=0;i<valute.size();i++)
			if(valute.get(i).getDatum().equals(datum)&& valute.get(i).getNaziv().equals(naziv))
               valute.remove(valute.get(i).getKursnaLista());
	}

	public Valuta pronadjiKurs(GregorianCalendar datum, String naziv) {
		for(int i=0;i<valute.size();i++)
			if(valute.get(i).getDatum().equals(datum)&& valute.get(i).getNaziv().equals(naziv))
				return valute.get(i);
		return null;
	}

}
