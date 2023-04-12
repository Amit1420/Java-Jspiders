package com.amit.composition;

import java.util.ArrayList;
import java.util.List;

/*
This is Order class, which HAS-A composition association with LineItem class. 
That means if you delete Order, then associated all LineItem must be deleted.
*/
public class Order {
	private int id;
	private String name;
	private List<LineItem> lineItems;

	public Order(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.lineItems = new ArrayList<LineItem>();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + ", lineItems=" + lineItems + "]";
	}
	
	// Add line item to order
	public void addItem(int id, int quantity, Product p) {
		this.lineItems.add(new LineItem(id, quantity, p));
	}
	
	// Remove line item from order for given item id
	public void removeItemById(int itemId) {
		for(int i=0;i<lineItems.size();i++)
		{
			LineItem c=lineItems.get(i);
			if(c.getId()==itemId)
			{
				this.lineItems.remove(c);
			}
		}
		
	}

}
