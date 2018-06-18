package com.se.bo;

public class ShipmentEntity {
	protected String shipmentEntityName;
	protected String identificationNumber;
	public ShipmentEntity(String shipmentEntityName, String identificationNumber) {
		super();
		this.shipmentEntityName = shipmentEntityName;
		this.identificationNumber = identificationNumber;
	}
	public String getShipmentEntityName() {
		return shipmentEntityName;
	}
	public void setShipmentEntityName(String shipmentEntityName) {
		this.shipmentEntityName = shipmentEntityName;
	}
	public String getIdentificationNumber() {
		return identificationNumber;
	}
	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	
	public void display() {
	}
		
	

}
