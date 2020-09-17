package mocmart;

public class MocMartProduct implements Comparable<MocMartProduct> {
	
	private int itemNum;
	private String itemName;
	private double itemPrice;
	private int quantity;
	private int restockQuantity;
	private int maxProducts;
	private static int numProducts = 0;
	
	public MocMartProduct() {
		;
	}

	public int getItemNum() {
		return itemNum;
	}
	public void setItemNum(int itemNum) {
		this.itemNum = itemNum;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getRestockQuantity() {
		return restockQuantity;
	}
	public void setRestockQuantity(int restockQuantity) {
		this.restockQuantity = restockQuantity;
	}
	public static int getNumProducts() {
		return numProducts;
	}
	public static void setNumProducts(int numProducts) {
		MocMartProduct.numProducts = numProducts;
	}
	
	@Override
	public int compareTo(MocMartProduct other) {
		return this.getItemNum() - other.getItemNum();
	}
}
