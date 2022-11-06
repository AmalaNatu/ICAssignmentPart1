package com.pace.assignment;

public class Hospital {

	public static void main(String[] args) {
		HospitalEmployee vito = new HospitalEmployee("Vito", 123);
		Doctor micheal = new Doctor("Micheal", 234, "Heart");
		Surgeon vincent = new Surgeon("Vincent", 645, "Brain", true);
		Nurse sonny = new Nurse("Sonny", 789,6); 
		System.out.println (vito);
		System.out.println (micheal);
		System.out.println(vincent);
		System.out.println(sonny);
		
		vito.work();
		micheal.work();
		vincent.work();
		sonny.work();
	}
}
