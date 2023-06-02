package Java;

public class Product {
	
	double price;
	int quantity;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice(int quantity) {
		
		return quantity * price;
	}

}
