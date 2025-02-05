package org.day1;

public class InternalStorage {
	
	private void processorName() {
		System.out.println("processorName : "+ " " + "I3process");

	}
	
	private void ramSize() {
		System.out.println("RAM Size : "+ " " + 4);

	}

	public static void main(String[] args) {
		InternalStorage internalStorage = new InternalStorage();
		PhoneDetails phoneDetails = new PhoneDetails();
		internalStorage.processorName();
		internalStorage.ramSize();
		phoneDetails.size();
		

	}

}
