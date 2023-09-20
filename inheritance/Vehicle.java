package inheritance;

class VehicleCommon {
	String catagory, model, enginsize, fuelefficiency, color, price;
	int year, tdoor, tseat;
	double weight, length;

	VehicleCommon(String catagory, String model, int tdoor, int tseat, double weight, double length, String enginsize,
			String fuelefficiency, int year, String color, String price) {
		this.catagory = catagory;
		this.model = model;
		this.tdoor = tdoor;
		this.tseat = tseat;
		this.weight = weight;
		this.length = length;
		this.enginsize = enginsize;
		this.fuelefficiency = fuelefficiency;
		this.year = year;
		this.color = color;
		this.price = price;
	}

	VehicleCommon(String catagory, String model, double weight, double length, String enginsize, String fuelefficiency,
			int year, String color, String price) {

		this.catagory = catagory;
		this.model = model;
		this.weight = weight;
		this.length = length;
		this.enginsize = enginsize;
		this.fuelefficiency = fuelefficiency;
		this.year = year;
		this.color = color;
		this.price = price;
	}

	void printInfoCar() {

		System.out.println("Chatagory       : " + catagory);
		System.out.println("Model           : " + model);
		System.out.println("Total Door      : " + tdoor);
		System.out.println("Total Seat      : " + tseat);
		System.out.println("Weight          : " + (int) weight + " Pounds");
		System.out.println("Length          : " + (int) length + " mm");
		System.out.println("Engin Size      : " + enginsize);
		System.out.println("Fuel Efficiency : " + fuelefficiency);
		System.out.println("Year            : " + year);

	}

	void printInfoBike() {

		System.out.println("Chatagory       : " + catagory);
		System.out.println("Model           : " + model);
		System.out.println("Weight          : " + (int) weight + " Kg");
		System.out.println("Length          : " + (int) length + " mm");
		System.out.println("Engin Size      : " + enginsize);
		System.out.println("Fuel Efficiency : " + fuelefficiency);
		System.out.println("Year            : " + year);

	}
}

class Car extends VehicleCommon {

	Car(String catagory, String model, int tdoor, int tseat, double weight, double length, String enginsize,
			String fuelefficiency, int year, String color, String price) {

		super(catagory, model, tdoor, tseat, weight, length, enginsize, fuelefficiency, year, color, price);

	}

	@Override
	void printInfoCar() {
		super.printInfoCar();
		System.out.println("Colour          : " + color + "\n\n");
	}
}

class Bike extends VehicleCommon {

	Bike(String catagory, String model, double weight, double length, String enginsize, String fuelefficiency, int year,
			String color, String price) {
		super(catagory, model, weight, length, enginsize, fuelefficiency, year, color, price);

	}

	void printInfoBike() {
		super.printInfoBike();
		System.out.println("Colour          : " + color);
		System.out.println("Price           : " + price);
	}
}

public class Vehicle {
	public static void main(String[] args) {

		System.out.println("                             VEHICLE DETAILS                     ");
		System.out.println("                            -----------------                     \n\n");

		Car Lamborghini = new Car("Car", "Lamborghini Aventador", 2, 4, 3700, 4780, "6.5-liter V12", "No Result", 2022,
				"Giallo Orion", "$500,000");
		Lamborghini.printInfoCar();

		Bike Gixer = new Bike("Bike", "Suzuki Gixxer", 137, 2050, "155cc", "0-60 miles per gallon.", 2014, "Blue",
				"1.50Lakh TK");
		Gixer.printInfoBike();
	}
}
