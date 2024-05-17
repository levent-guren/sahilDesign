package calistir;

import servlet.ApplicationServer;
import servlet.HttpRequest;
import servlet.HttpRequest.RequestType;

public class Calistir {
	public static void main(String[] args) {
		HttpRequest request = new HttpRequest();
		request.setTip(RequestType.POST);
		request.setUrl("/servlet/PersonelServlet");
		request.setUrlParameters("id=134");

		ApplicationServer applicationServer = new ApplicationServer();
		applicationServer.execute(request);

		HttpRequest request2 = new HttpRequest();
		request2.setTip(RequestType.GET);
		request2.setUrl("/servlet/Rapor");
		request2.setUrlParameters("raporId=43&adi=Lev%");
		applicationServer.execute(request2);
	}
}
