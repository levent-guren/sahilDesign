package hesaplayici;

public class HesapMakinesi implements IHesapMakinesi {

	@Override
	public int hesapla(int sayi1, int sayi2, char islem) {
		switch (islem) {
		case '+': {
			return sayi1 + sayi2;
		}
		case '-': {
			return sayi1 - sayi2;
		}
		case '*': {
			return sayi1 * sayi2;
		}
		case '/': {
			return sayi1 / sayi2;
		}
		}
		return 0;
	}

}
