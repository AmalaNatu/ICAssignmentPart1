package com.pace.assignment;

public class HospitalEmployee {

	protected String mName;
	protected int mNumber;
	
	public HospitalEmployee(String name, int number) {
		super();
		this.mName = name;
		this.mNumber = number;
	}

	public String getName() {
		return mName;
	}

	public void setName(String name) {
		this.mName = name;
	}

	public int getNumber() {
		return mNumber;
	}

	public void setNumber(int number) {
		this.mNumber = number;
	}
	
	@Override
	public String toString() {
		return mName + " "+ mNumber;
	}

	public void work() {
		System.out.println (mName + " works for the hospital.");
	}
}
