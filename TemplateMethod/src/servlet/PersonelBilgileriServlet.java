package servlet;

public class PersonelBilgileriServlet extends Servlet {

	@Override
	public void doGet(HttpRequest request) {
		System.out
				.println("Personel Bilgileri Servlet get yöntemi ve "
						+ request.getUrlParameters()
						+ " parametreleri ile çağırıldı");
	}

	@Override
	public void doPost(HttpRequest request) {
		System.out
				.println("Personel Bilgileri Servlet post yöntemi ve "
						+ request.getUrlParameters()
						+ " parametreleri ile çağırıldı");
	}

}
