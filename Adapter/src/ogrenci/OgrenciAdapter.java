package ogrenci;

public class OgrenciAdapter {
	private Ogrenci ogrenci;

	public void setOgrenci(Ogrenci ogrenci) {
		this.ogrenci = ogrenci;
	}

	public String getAdi() {
		return (String) ogrenci.getOzellik("adi");
	}

	public void setAdi(String adi) {
		ogrenci.setOzellik("adi", adi);
	}

	public int getNo() {
		Integer no = (Integer) ogrenci.getOzellik("no");
		if (no == null) {
			return 0;
		}
		return no.intValue();
	}

	public void setNo(int no) {
		ogrenci.setOzellik("no", no);
	}
}
