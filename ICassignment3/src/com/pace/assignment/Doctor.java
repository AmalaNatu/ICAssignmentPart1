package com.pace.assignment;

public class Doctor extends HospitalEmployee {
public String speciality;

public Doctor(String name, int number, String speciality) {
	super(name, number);
	this.speciality = speciality;
}

@Override
public String toString() {
	return mName +" "+ mNumber +" "+speciality ;
}
public void work() {
	super.work();
	System.out.println(mName+" is a Heart Doctor");
}
}
