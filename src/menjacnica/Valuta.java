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
		if(naziv==null) throw new RuntimeException("Uneta vrednost ne sme biti null");
		this.naziv = naziv;
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		if(skraceniNaziv==null) throw new RuntimeException("Uneta vrednost ne sme biti null");
		this.skraceniNaziv = skraceniNaziv;
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		if(datum==null) throw new RuntimeException("Uneta vrednost ne sme biti null");
		this.datum = datum;
	}
	public LinkedList<Kurs> getKursnaLista() {
		return kursnaLista;
	}
	public void setKursnaLista(LinkedList<Kurs> kursnaLista) {
		if(kursnaLista==null) throw new RuntimeException("Uneta vrednost ne sme biti null");
		this.kursnaLista = kursnaLista;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		result = prime * result
				+ ((kursnaLista == null) ? 0 : kursnaLista.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result
				+ ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (kursnaLista == null) {
			if (other.kursnaLista != null)
				return false;
		} else if (!kursnaLista.equals(other.kursnaLista))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (skraceniNaziv == null) {
			if (other.skraceniNaziv != null)
				return false;
		} else if (!skraceniNaziv.equals(other.skraceniNaziv))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Valuta [naziv=" + naziv + ", skraceniNaziv=" + skraceniNaziv
				+ ", datum=" + datum + ", kursnaLista=" + kursnaLista + "]";
	}
	
	

}
