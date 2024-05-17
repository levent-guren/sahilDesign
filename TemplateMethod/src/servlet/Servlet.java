package servlet;

public abstract class Servlet {
	public void service(HttpRequest request) {
		System.out.println("Request geldi");
		process(request);
		System.out.println("Response döndürülüyor");
	}

	private void process(HttpRequest request) {
		if (request.getTip() == HttpRequest.RequestType.GET) {
			doGet(request);
		} else if (request.getTip() == HttpRequest.RequestType.POST) {
			doPost(request);
		}
	}

	public abstract void doGet(HttpRequest request);

	public abstract void doPost(HttpRequest request);
}
