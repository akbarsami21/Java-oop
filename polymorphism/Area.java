package polymorphism;

class Shape {
	double area(int num1, int num2) {
		return 0;
	}
}

class Rectangle extends Shape {

	@Override
	double area(int length, int width) {

		return length * width;
	}
}

class Triangle extends Shape {

	@Override
	double area(int base, int height) {

		return 0.5 * base * height;
	}
}

public class Area {
	public static void main(String[] args) {
		Shape s1 = new Shape();
		s1 = new Rectangle();
		System.out.println("Area Of Rectagnle: " + s1.area(10, 20));

		s1 = new Triangle();
		System.out.println("Area Of Triagnle : " + s1.area(10, 20));
	}

}
