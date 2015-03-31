package specifikacijainterfejsa;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.Kurs;
import menjacnica.Valuta;

public class ImplementacijaInterfejsa implements Interfejs {
	
	Valuta[] valuteNiz = new Valuta[100];
	
    public void dodajKurs(GregorianCalendar datum, String naziv,
			LinkedList<Kurs> kurs) {
		for(int i=0;i<valuteNiz.length;i++)
			if(valuteNiz[i].getNaziv().equals(naziv)){
				valuteNiz[i].setDatum(datum);
				valuteNiz[i].setKursnaLista(kurs);
			}

	}

	public void obrisiKurs(GregorianCalendar datum, String naziv) {
		
	}

	public Valuta pronadjiKurs(GregorianCalendar datum, String naziv) {
		
		return null;
	}

}
