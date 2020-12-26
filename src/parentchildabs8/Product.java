package parentchildabs8;

public class Product {
	protected int ProductId;
	protected String ProductName;
	protected float price;
	public Product(int productId, String productName, float price) {
		ProductId = productId;
		ProductName = productName;
		this.price = price;
	}
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float calculatediscountr()
	{
		float discount=(12*price)/100;
		return discount;
	}
	

}
