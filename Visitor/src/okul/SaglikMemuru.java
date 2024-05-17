package okul;

public class SaglikMemuru implements Visitor {

	@Override
	public void accept(Kisi kisi) {
		System.out.println("Sağlık Memuru: " + kisi.getAdi()
				+ " adlı kişiye aşı yapıyor");
	}

}
