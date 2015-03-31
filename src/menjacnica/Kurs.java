package menjacnica;

public class Kurs {

	private int prodajniKurs;
	private int srednjiKurs;
	private int kupovniKurs;
	
	public int getProdajniKurs() {
		return prodajniKurs;
	}
	public void setProdajniKurs(int prodajniKurs) {
		this.prodajniKurs = prodajniKurs;
	}
	public int getSrednjiKurs() {
		return srednjiKurs;
	}
	public void setSrednjiKurs(int srednjiKurs) {
		this.srednjiKurs = srednjiKurs;
	}
	public int getKupovniKurs() {
		return kupovniKurs;
	}
	public void setKupovniKurs(int kupovniKurs) {
		this.kupovniKurs = kupovniKurs;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + kupovniKurs;
		result = prime * result + prodajniKurs;
		result = prime * result + srednjiKurs;
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
		Kurs other = (Kurs) obj;
		if (kupovniKurs != other.kupovniKurs)
			return false;
		if (prodajniKurs != other.prodajniKurs)
			return false;
		if (srednjiKurs != other.srednjiKurs)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Kurs [prodajniKurs=" + prodajniKurs + ", srednjiKurs="
				+ srednjiKurs + ", kupovniKurs=" + kupovniKurs + "]";
	}
	
}
