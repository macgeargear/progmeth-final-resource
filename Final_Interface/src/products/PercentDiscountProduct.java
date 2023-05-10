package products;

import discount.PercentDiscountable;
import logic.ShopUtil;

public class PercentDiscountProduct extends BaseProduct implements PercentDiscountable {
	
	private double percent;

	public PercentDiscountProduct(String name, int price, double percent) {
		super(name, price);
		// TODO Auto-generated constructor stub
		setPercent(percent);
	}

	@Override
	public int calcDiscountPerPiece() {
		// TODO Auto-generated method stub
		return ShopUtil.calculateDiscountUsingPercent(price, percent);
	}
	
	public int calculateDiscount(int quantity) {
		return (quantity * calcDiscountPerPiece());
	}
	
	public String toString() {
		return this.getProductName() + " (Price: " + this.getPrice() +", "+ this.getPercent() + "% Off)";
	}

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		if (percent < 0) {
			percent = 0;
		} else if (percent > 100) {
			percent = 100;
		}
		this.percent = percent;
	}
	
	

}
