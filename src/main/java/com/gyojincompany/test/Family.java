package com.gyojincompany.test;

public class Family {
	
	public String father;
	public String mother;
	public String sister;
	public String brother;
	
	public Family() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Family(String father, String mother, String sister, String brother) {
		super();
		this.father = father;
		this.mother = mother;
		this.sister = sister;
		this.brother = brother;
	}
	public String getFather() {
		return father;
	}
	public void setFather(String father) {
		this.father = father;
	}
	public String getMother() {
		return mother;
	}
	public void setMother(String mother) {
		this.mother = mother;
	}
	public String getSister() {
		return sister;
	}
	public void setSister(String sister) {
		this.sister = sister;
	}
	public String getBrother() {
		return brother;
	}
	public void setBrother(String brother) {
		this.brother = brother;
	}
	
	

}
