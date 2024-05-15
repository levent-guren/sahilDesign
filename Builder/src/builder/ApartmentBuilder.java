package builder;

public class ApartmentBuilder implements Builder {

	@Override
	public Product getProduct() {
		Product product = new ApartmentProduct();
		product.setFloorCount(12);
		product.setType("Concrete");
		return product;
	}

}
