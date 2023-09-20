package polymorphism;

import java.util.Scanner;

class Tempreture {
	double num;

	Tempreture(double num) {
		this.num = num;
	}

	double tempreture() {
		return 0;
	}
}

class FarenhitToCelcius extends Tempreture {

	FarenhitToCelcius(double num) {
		super(num);
	}

	@Override
	double tempreture() {
		return (((5 * num) - 160) / 9);
	}
}

class CelciusToFarenhit extends Tempreture {

	CelciusToFarenhit(double num) {
		super(num);
	}

	@Override
	double tempreture() {
		return (((9 * num) + 160) / 5);
	}
}

public class Temp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1.Farenhite To Celcius\n2.Celcius To Farenhite : ");
		int n = sc.nextInt();

		if (n == 1) {
			System.out.print("\nEnter Farenhite Tempreture : ");
			double temp = sc.nextDouble();
			Tempreture C = new FarenhitToCelcius(temp);
			System.out.println("Celcius Tempreture         : " + C.tempreture());
		} else if (n == 2) {
			System.out.print("\nEnter Celcius Tempreture : ");
			double temp = sc.nextDouble();
			Tempreture C = new CelciusToFarenhit(temp);
			System.out.println("Farenhite Tempreture     : " + C.tempreture());
		} else
			System.out.println("\n\nInvalid! May Be You Typed Wrong.Try Again.");
		sc.close();
	}
}
