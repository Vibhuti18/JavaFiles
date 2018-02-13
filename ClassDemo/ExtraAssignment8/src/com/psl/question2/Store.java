package com.psl.question2;

public class Store {
	
	int itemId;			
	String itemName;		
	Grocery itemType;		
	float itemQuantity; 		
	float itemPrice;
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Grocery getItemType() {
		return itemType;
	}
	public void setItemType(Grocery itemType) {
		this.itemType = itemType;
	}
	public float getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(float f) {
		this.itemQuantity = f;
	}
	public float getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}		


}
