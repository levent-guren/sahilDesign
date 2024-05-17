package servlet;

public class ApplicationServer {
	public void execute(HttpRequest request) {
		Servlet servlet = getServlet(request);
		servlet.service(request);
	}

	private Servlet getServlet(HttpRequest request) {
		if (request.getUrl().startsWith("/servlet/PersonelServlet")) {
			return new PersonelBilgileriServlet();
		} else if (request.getUrl().startsWith("/servlet/Rapor")) {
			return new RaporServlet();
		}
		return null;
	}
}
