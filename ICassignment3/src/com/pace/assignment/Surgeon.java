package com.pace.assignment;

public class Surgeon extends Doctor {
public boolean operating;

public Surgeon(String name, int number, String speciality, boolean operating) {
	super(name, number, speciality);
	this.operating = operating;
}

@Override
public String toString() {
	return mName +" " + mNumber+ " "+ "Brain Operating :"+ operating ;
}
public void work() {
	super.work();
	System.out.println(mName+"is operating now");
}
}
