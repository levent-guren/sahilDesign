package bean;

public class Adres implements Cloneable {
	private String il;
	private String ilce;
	private String mahalle;
	private String cadde;

	public String getIl() {
		return il;
	}

	public void setIl(String il) {
		this.il = il;
	}

	public String getIlce() {
		return ilce;
	}

	public void setIlce(String ilce) {
		this.ilce = ilce;
	}

	public String getMahalle() {
		return mahalle;
	}

	public void setMahalle(String mahalle) {
		this.mahalle = mahalle;
	}

	public String getCadde() {
		return cadde;
	}

	public void setCadde(String cadde) {
		this.cadde = cadde;
	}

	@Override
	public String toString() {
		return "Adres [il=" + il + ", ilce=" + ilce + ", mahalle=" + mahalle + ", cadde=" + cadde + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
