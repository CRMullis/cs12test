// Coded by Collin Mullis
// Car class for Practice Practicum

// Keeps track of Capouch's Cars.

class Car {
	public String make;
	public String model;
	public int year;

/*-----------------------------------------------------------------------*/

	Car(String thismake, String thismodel, int thisyear) {
		make = thismake; 
		model = thismodel;
		year = thisyear;
	}
	
	Car(String thismake, String thismodel) {
		make = thismake;
		model = thismodel;
	}	
	Car(String thismake) {
		make = thismake;
	}
	public String toString() {
		String desc = "Make: " + make + " Model: " + model + " Year: " + year;
		return desc;
	}
}
