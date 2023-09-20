package Interface;

interface Animal {
	void eat();
}

class Dog implements Animal {

	public void eat() {
		System.out.println("Dog Can Eat All");
	}

}

class Cat implements Animal {

	public void eat() {
		System.out.println("Cat Like to Eat Fish");
	}
}

public class Interface {
	public static void main(String[] args) {

		Animal ob;
		ob = new Dog();
		ob.eat();
	}
}
