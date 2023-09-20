package Interface;

interface Calculator2 {
	double sum();

	double sub();

	double mul();

	double div();
}

class Processing implements Calculator2 {
	double a, b;

	Processing(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double sum() {
		return a + b;
	}

	public double sub() {
		return a - b;
	}

	public double mul() {
		return a * b;
	}

	public double div() {
		return a / b;
	}
}

public class Main {
	public static void main(String[] args) {

		Processing ob = new Processing(10, 20);
		System.out.println("Sum : " + ob.sum());

		ob = new Processing(50, 30);
		System.out.println("Sub : " + ob.sub());

		ob = new Processing(50, 3);
		System.out.println("Mul : " + ob.mul());

		ob = new Processing(30, 20);
		System.out.println("Div : " + ob.div());
	}

}
