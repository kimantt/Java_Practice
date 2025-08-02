package genericCollection.sec08;

public class Product {
	private String kind;
	private String name;
	private int price;
	
	public Product(String kind, String name, int price) {
		this.kind = kind;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return kind + " | " + name + " | " + price + "원";
	}
}
