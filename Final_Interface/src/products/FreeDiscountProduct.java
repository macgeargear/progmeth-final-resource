package products;

import discount.FreeDiscountable;
import logic.ShopUtil;

public class FreeDiscountProduct extends BaseProduct implements FreeDiscountable {
	
	private int promoQuantity;
	private int freeQuantity;

	public FreeDiscountProduct(String name, int price, int promoQ, int freeQ) {
		super(name, price);
		// TODO Auto-generated constructor stub
		setFreeQuantity(freeQ);
		setPromoQuantity(promoQ);
	}
	
	public int calcFreeDiscountPieces(int totalQuantityBought) {
		
		return ShopUtil.calculateFreeDiscountPieces(freeQuantity, promoQuantity, totalQuantityBought);
	}
	
	public int calculateDiscount(int quantity) {
		
		return (price * calcFreeDiscountPieces(quantity));
	}
	
	public String toString() {
		return this.getProductName() + " (Price: " + this.getPrice() + ", Buy " + this.getPromoQuantity() + " Get " + this.getFreeQuantity() + " Free)";
	}

	public int getPromoQuantity() {
		return promoQuantity;
	}

	public void setPromoQuantity(int promoQuantity) {
		this.promoQuantity = Math.max(1, promoQuantity);
	}

	public int getFreeQuantity() {
		return freeQuantity;
	}

	public void setFreeQuantity(int freeQuantity) {
		this.freeQuantity = Math.max(1, freeQuantity);
	}
	
	

}
