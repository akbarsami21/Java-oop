package inheritance;

class Person1 {
	private String name;
	private int age, id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void printInfo() {
		System.out.println("Name : " + getName());
		System.out.println("Age  : " + getAge());
		System.out.println("Id   : " + getId());

	}

}

class Student4 extends Person1 {
	private String program;

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}
}

public class InheriPrivateMem {
	public static void main(String[] args) {
		Student4 p1 = new Student4();
		p1.setName("Akbar Sami");
		p1.setAge(20);
		p1.setId(2253);
		p1.setProgram("BSc In CSE");
		p1.printInfo();
		System.out.println("Program :" + p1.getProgram() + "\n");

		Student4 p2 = new Student4();
		p2.setName("Sakib Chowdury");
		p2.setAge(21);
		p2.setId(2241);
		p2.setProgram("BSc In CSE");
		p2.printInfo();
		System.out.println("Program :" + p2.getProgram() + "\n");

	}
}
