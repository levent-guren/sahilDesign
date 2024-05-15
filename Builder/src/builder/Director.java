package builder;

public class Director {
	private Builder builder;

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}

	public Product getProduct() {
		return builder.getProduct();
	}

}
