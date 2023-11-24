package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Management {
	@Id
private int productid;
private String productname;
private int productamount;
private int manufacturedate;
private int expirydate;
private int quantity;
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public int getProductamount() {
	return productamount;
}
public void setProductamount(int productamount) {
	this.productamount = productamount;
}
public int getManufacturedate() {
	return manufacturedate;
}
public void setManufacturedate(int manufacturedate) {
	this.manufacturedate = manufacturedate;
}
public int getExpirydate() {
	return expirydate;
}
public void setExpirydate(int expirydate) {
	this.expirydate = expirydate;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public Management(int productid, String productname, int productamount, int manufacturedate, int expirydate,
		int quantity) {
	super();
	this.productid = productid;
	this.productname = productname;
	this.productamount = productamount;
	this.manufacturedate = manufacturedate;
	this.expirydate = expirydate;
	this.quantity = quantity;
}
public Management() {
	super();
	// TODO Auto-generated constructor stub
}

}
