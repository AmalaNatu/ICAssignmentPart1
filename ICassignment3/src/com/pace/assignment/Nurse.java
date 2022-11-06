package com.pace.assignment;

public class Nurse extends HospitalEmployee{
public int numOfPatients;

public Nurse(String name, int number, int numOfPatients) {
	super(name, number);
	this.numOfPatients = numOfPatients;
}

@Override
public String toString() {
	return mName +" "+ mNumber+ " "+ numOfPatients  ;
}
public void work() {
	super.work();
	System.out.println(mName +" is a nurse with "+ numOfPatients + " patients");
}
}
