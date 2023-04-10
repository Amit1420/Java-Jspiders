package com.amit.lambda;

import java.util.Objects;

public class Customer {
private int id;
private String name;
private String product;
private String type;
public Customer(int id, String name, String product, String type) {
	super();
	this.id = id;
	this.name = name;
	this.product = product;
	this.type = type;
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
public String getProduct() {
	return product;
}
public void setProduct(String product) {
	this.product = product;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", product=" + product + ", type=" + type + "]";
}
@Override
	public int hashCode() {
		
		return Objects.hash(id,name,product,type);
	}
@Override
	public boolean equals(Object obj) {
	    if(this==obj) return true;
	    if(obj==null) return true;
	    if(getClass()!=obj.getClass()) return false;
	    Customer other = (Customer) obj;
	    return id == other.id && Objects.equals(name, other.name) && Objects.equals(type, other.type);
	    		
	}

}
