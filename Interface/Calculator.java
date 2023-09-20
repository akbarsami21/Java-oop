package Interface;

import java.util.Scanner;

interface Template {
	double calculate();
}

class Sum implements Template {
	double num1, num2;

	Sum(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public double calculate() {
		return num1 + num2;
	}
}

class Sub implements Template {
	double num1, num2;

	Sub(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public double calculate() {
		return num1 - num2;
	}
}

class Mul implements Template {
	double num1, num2;

	Mul(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public double calculate() {
		return num1 * num2;
	}
}

class Div implements Template {
	double num1, num2;

	Div(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public double calculate() {
		return num1 / num2;
	}
}

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Two Number         : ");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		System.out.print("Choose Operator(+,-,*,/) : ");
		char op = sc.next().charAt(0);

		if (op == '+') {
			Sum ob = new Sum(num1, num2);
			System.out.println("Sum Of Two Number        : " + ob.calculate());
		}

		else if (op == '-') {
			Sub ob = new Sub(num1, num2);
			System.out.println("Sub Of Two Number        : " + ob.calculate());
		}

		else if (op == '*') {
			Mul ob = new Mul(num1, num2);
			System.out.println("Mul Of Two Number        : " + ob.calculate());
		}

		else if (op == '/') {
			Div ob = new Div(num1, num2);
			System.out.println("Div Of Two Number        : " + ob.calculate());
		} else
			System.out.println("You Type Wrong Operator");
	}

}
