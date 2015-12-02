package com.dosamantes;

public class Ingredient {

	private String Item;
	private String ItemPackSize;
	private String OuncesOnHand;
	private String ContainerType;
	private	String QtyPer36;
	private	String QtyPerBatch;
	private String UnitCost; //either per ounce or per item
	
	public String getItemName(){
		return Item;
	}
	 
	public void setItemName(String name){
		this.Item = name;
	}
	
	public String getItemPackSize(){
		return ItemPackSize;
	}
	
	public void setItemPackSize(String packSize){
		this.ItemPackSize = packSize;
	}
	
	public String getOuncesOnHand(){
		return OuncesOnHand;
	}
	
	public void setOuncesOnHand(String onHand){
		this.OuncesOnHand = onHand;
	}
	
	public String getContainerType(){
		return ContainerType;
	}
	
	public void setContainerType(String container){
		this.ContainerType = container;
	}
	
	public String getQtyPer36(){
		return QtyPer36;
	}
	
	public void setQtyPer36(String per36){
		this.QtyPer36 = per36;
	}
	
	public String getQtyPerBatch(){
		return QtyPerBatch;
	}
	
	public void setQtyPerBatch(String perBatch){
		this.QtyPerBatch = perBatch;
	}
	
	public String getUnitCost(){
		return UnitCost;
	}
	
	public void setUnitCost(String perUnit){
		this.UnitCost = perUnit;
	}
}
