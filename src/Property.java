


public abstract class Property extends Square {

	protected Group group;
	protected int baseRent;
	protected int purchasePrice;
	protected int mortgageValue;

	
	public Property(Group group, int purchasePrice, int mortgageValue, int baseRent) {
		super();
		this.group = group;
		this.purchasePrice = purchasePrice;
		this.mortgageValue = mortgageValue;
		this.baseRent = baseRent;
	}
	
	public abstract int getRentAmount();
	
	public int getPurchasePrice() {
		return purchasePrice;
	}
	
	public int getMortgageValue() {
		return mortgageValue;
	}
	
	public Group getGroup() {
		return group;
	}
}
