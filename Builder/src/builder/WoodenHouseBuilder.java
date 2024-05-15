package builder;

public class WoodenHouseBuilder implements Builder {

	@Override
	public Product getProduct() {
		Product product = new WoodenHouseProduct();
		product.setFloorCount(3);
		product.setType("Wood");
		return product;
	}

}
