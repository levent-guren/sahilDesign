package servlet;

public class HttpRequest {
	public static enum RequestType {
		GET, POST, PUT, DELETE, HEAD, TRACE, OPTIONS;
	}

	private RequestType tip;
	private String url;
	private String urlParameters;

	public RequestType getTip() {
		return tip;
	}

	public void setTip(RequestType tip) {
		this.tip = tip;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrlParameters() {
		return urlParameters;
	}

	public void setUrlParameters(String urlParameters) {
		this.urlParameters = urlParameters;
	}

}
