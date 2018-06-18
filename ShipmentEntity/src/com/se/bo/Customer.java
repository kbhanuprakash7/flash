package com.se.bo;

public class Customer extends ShipmentEntity {

	private Integer id;
	private String name;	
	
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Customer(String shipmentEntityName, String identificationNumber, Integer id, String name) {
		super(shipmentEntityName, identificationNumber);
		this.id = id;
		this.name = name;
	}
	
	public void display(){
		System.out.format("%-15s %-25s %-15s %-15s\n",this.shipmentEntityName,this.identificationNumber,this.name,this.id);
	}
	

}
