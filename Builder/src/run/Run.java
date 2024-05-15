package run;

import builder.ApartmentBuilder;
import builder.Director;
import builder.Product;
import builder.WoodenHouseBuilder;

public class Run {
	public static void main(String[] args) {
		Director director = new Director();
		director.setBuilder(new ApartmentBuilder());
		Product product = director.getProduct();
		System.out.println(product);

		director.setBuilder(new WoodenHouseBuilder());
		Product product2 = director.getProduct();
		System.out.println(product2);
	}
}
