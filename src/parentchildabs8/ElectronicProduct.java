package parentchildabs8;

public class ElectronicProduct extends Product{
	private String Dimension;
	private int warranty;
	public ElectronicProduct(int productId, String productName, float price, String dimension, int warranty) {
		super(productId, productName, price);
		Dimension = dimension;
		this.warranty = warranty;
	}
	public String getDimension() {
		return Dimension;
	}
	public void setDimension(String dimension) {
		Dimension = dimension;
	}
	public int getWarranty() {
		return warranty;
	}
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	@Override
	public float calculatediscountr() {
		// TODO Auto-generated method stub
		float discountcorrect=(25*super.price)/100;
		return discountcorrect;
	}
	

}
