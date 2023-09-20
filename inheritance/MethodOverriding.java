package inheritance;

class A {
	String name;
	int age, id;

	void print() {
		System.out.println("Name : " + name);
		System.out.println("Age  : " + age);
		System.out.println("ID   : " + id);
		System.out.println();
	}
}

class B extends A {
	String quali;

	@Override
	void print() {
		System.out.println("Name          : " + name);
		System.out.println("Age           : " + age);
		System.out.println("ID            : " + id);
		System.out.println("Qualificaiton : " + quali);
		System.out.println();
	}
}

class C extends B {
	String program;

	@Override
	void print() {
		System.out.println("Name          : " + name);
		System.out.println("Age           : " + age);
		System.out.println("ID            : " + id);
		System.out.println("Qualificaiton : " + quali);
		System.out.println("Program       : " + program);
		System.out.println();
	}
}

public class MethodOverriding {
	public static void main(String[] args) {

		A a = new A();
		B b = new B();
		C c = new C();

		a.name = "X";
		a.age = 20;
		a.id = 210;
		a.print();

		b.name = "Y";
		b.age = 20;
		b.id = 211;
		b.quali = "BSc in CSE";
		b.print();

		c.name = "Z";
		c.age = 20;
		c.id = 212;
		c.quali = "BSc in CSE";
		c.program = "Computer Scincece & Engingeering";
		c.print();
	}
}
