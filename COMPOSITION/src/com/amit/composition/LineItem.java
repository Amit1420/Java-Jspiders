package com.amit.composition;
/*
This is LineItem class, which HAS-A aggregation association with Product class. 
That means, if you delete LineItem, then associated Product can exist.
*/
public class LineItem {
	private int id;
	private int quantity;
	private Product p;

	public LineItem(int id, int quantity, Product p) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.p = p;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Product getP() {
		return p;
	}
	public void setP(Product p) {
		this.p = p;
	}
	@Override
	public String toString() {
		return "LineItem [id=" + id + ", quantity=" + quantity + ", p=" + p + "]";
	}

}
