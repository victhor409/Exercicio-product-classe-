package entites;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	
	public double TotalValueStock() {
		return price*quantity;
	}
	
	public void addProduct(int quantity) {
		this.quantity+=quantity;
	}
	public void removeProduct(int quantity) {
		this.quantity-= quantity;
	}
	

}
