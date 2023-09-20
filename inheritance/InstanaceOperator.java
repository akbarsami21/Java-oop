package inheritance;

class Animal {

}

class Persoon extends Animal {

}

class Teacher extends Persoon {

}

public interface InstanaceOperator {
	public static void main(String[] args) {
		Animal a = new Animal();
		Persoon p = new Persoon();
		Teacher t = new Teacher();

		System.out.println(a instanceof Animal);
		System.out.println(p instanceof Animal);
		System.out.println(t instanceof Persoon);
		System.out.println(p instanceof Teacher);

	}

}
