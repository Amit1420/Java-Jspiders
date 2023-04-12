package com.amit.composition;

///**
//* Aggregation = HAS-A Relationship.
//*
//* Aggregation is an association represents a part of a whole relationship where a part can exist without a whole.
//* It has a weaker relationship. For example, If line-item HAS-A product, then a line item is a whole and product is a part. 
//* If a line item is deleted, then corresponding product needs not to be deleted.
//*/

///**
//* Composition = HAS-A relationship, but restricted form of Aggregation 
//*
//* Composition is an association represents a part of a whole relationship where a part cannot exist without a whole. If a whole is deleted then 
//* all parts are deleted. It has a stronger relationship. For example, if order HAS-A line-items, then an order is a whole and line items are parts. 
//* If an order is deleted then all corresponding line items for that order should be deleted.
//*/

/**
* This is test class for aggregation and composition example
* 
*/
public class Composition {

	public static void main(String[] args) {
		
		// Create Products
				Product p1 = new Product(1, "Pen", "This is red pen");
				Product p2 = new Product(2, "Pencil", "This is pencil");
				Product p3 = new Product(3, "ColorBox", "This is color box");
										
				// Create Order and Add Line Items
				Order o = new Order(1, "ORD#1");
				o.addItem(1, 2, p1); // Ordered of 2 quantity for p1 product
				o.addItem(2, 1, p2); // Ordered of 1 quantity for p2 product
				o.addItem(3, 5, p3); // Ordered of 5 quantity for p3 product		
				// Print Order detail before deleting 
				System.out.println("Order ---");
				System.out.println(o);
				System.out.println("**************************************************************");
				// Print Order detail after deleting line item from order by item id
				o.removeItemById(1);
				System.out.println("Order ---");
				System.out.println(o);
				System.out.println("**************************************************************");
				// Deleting order would also delete associated LineItems ------- Represents Composition relationship between Order and LineItem		
				o = null;	
				System.out.println("Order ---");
				System.out.println(o);
				System.out.println("**************************************************************");
				// Line items are deleted, but associated products can still exist -------- Represents Aggregation relationship between LineItem and Product				
				System.out.println("Products ---");
				System.out.println(p1);
				System.out.println(p2);
				System.out.println(p3);
	}

}
