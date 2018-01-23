package com.ssm.entity;

public class House {
	private String areA;
	private String houseS;
	private int pricE; 
	
	public String getAreA() {
		return areA;
	}
	public void setAreA(String areA) {
		this.areA = areA;
	}
	public String getHouseS() {
		return houseS;
	}
	public void setHouseS(String houseS) {
		this.houseS = houseS;
	}
	public int getPricE() {
		return pricE;
	}
	public void setPricE(int pricE) {
		this.pricE = pricE;
	}
	public House(String areA, String houseS, int pricE) {
		super();
		this.areA = areA;
		this.houseS = houseS;
		this.pricE = pricE;
	}
	public House() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "House [areA=" + areA + ", houseS=" + houseS + ", pricE=" + pricE + "]";
	}
	
}
