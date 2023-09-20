package AbstractionClass;

abstract class Shape {
	double num1, num2;

	abstract void area();
}

class Rectangle extends Shape {

	Rectangle(double length, double width) {
		this.num1 = length;
		this.num2 = width;

	}

	@Override
	void area() {
		System.out.println("Area Of RectAngle : " + (num1 * num2));
	}
}

class Triangle extends Shape {

	Triangle(double base, double height) {
		this.num1 = base;
		this.num2 = height;
	}

	@Override
	void area() {
		System.out.println("Area Of TriAngle  : " + (0.5 * num1 * num2));
	}
}

class Circle extends Shape {
	Circle(double redius) {
		this.num1 = redius;
	}

	@Override
	void area() {
		System.out.println("Area Of Circle    : " + (3.1416 * num1 * num1));
	}
}

public class Area {
	public static void main(String[] args) {
		Shape tri;
		tri = new Rectangle(10, 20);
		tri.area();

		tri = new Triangle(10, 20);
		tri.area();

		tri = new Circle(10);
		tri.area();
	}

}
