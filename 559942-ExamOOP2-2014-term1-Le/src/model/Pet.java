package model;

import utility.insuranceCompany;

public class Pet {
	private insuranceCompany inCo;
	private String insuranceNumber;
	
	public final int MAXIMUM_HEIGHT = 25;
	
	public Pet(insuranceCompany inCo, String insuranceNumber) {
		super();
		this.inCo = inCo;
		this.insuranceNumber = insuranceNumber;
	}
	public insuranceCompany getInCo() {
		return inCo;
	}
	public void setInCo(insuranceCompany inCo) {
		this.inCo = inCo;
	}
	public String getInsuranceNumber() {
		return insuranceNumber;
	}
	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}
	
	
}