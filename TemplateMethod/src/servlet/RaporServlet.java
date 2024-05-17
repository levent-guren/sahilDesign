package servlet;

public class RaporServlet extends Servlet {

	@Override
	public void doGet(HttpRequest request) {
		System.out.println("Rapor Servleti get yöntemi ve "
				+ request.getUrlParameters()
				+ " parametreleri ile çağırıldı");
	}

	@Override
	public void doPost(HttpRequest request) {
		System.out.println("Rapor Servleti post yöntemi ve "
				+ request.getUrlParameters()
				+ " parametreleri ile çağırıldı");
	}

}
