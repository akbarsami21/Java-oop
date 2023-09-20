package polymorphism;

class Sum {
	void add(int a, int b) {
		System.out.println(a + b);
	}

	void add() {
		System.out.println("Hello World");
	}

	void add(double a, double b) {
		System.out.println(a + b);
	}
}

public class Addition {
	public static void main(String[] args) {
		Sum ob = new Sum();
		ob.add();
		ob.add(2.5, 1.5);
		ob.add(5, 4);

	}

}
