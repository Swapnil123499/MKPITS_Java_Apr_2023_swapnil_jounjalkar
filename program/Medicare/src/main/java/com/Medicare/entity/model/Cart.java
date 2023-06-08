package com.Medicare.entity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart {
@Id
@GeneratedValue(strategy =GenerationType.AUTO)
private Long cartid;
private String productnameofcart;
private String usernameofcart;
private Long discountedpriceincart;
public Cart() {
	super();
	// TODO Auto-generated constructor stub
}
public Cart(Long cartid, String productnameofcart, String usernameofcart, Long discountedpriceincart) {
	super();
	this.cartid = cartid;
	this.productnameofcart = productnameofcart;
	this.usernameofcart = usernameofcart;
	this.discountedpriceincart = discountedpriceincart;
}
public Long getCartid() {
	return cartid;
}
public void setCartid(Long cartid) {
	this.cartid = cartid;
}
public String getProductnameofcart() {
	return productnameofcart;
}
public void setProductnameofcart(String productnameofcart) {
	this.productnameofcart = productnameofcart;
}
public String getUsernameofcart() {
	return usernameofcart;
}
public void setUsernameofcart(String usernameofcart) {
	this.usernameofcart = usernameofcart;
}
public Long getDiscountedpriceincart() {
	return discountedpriceincart;
}
public void setDiscountedpriceincart(Long discountedpriceincart) {
	this.discountedpriceincart = discountedpriceincart;
}

}
