package polymorphism;

class Person {
	String name, address, qualificaton, height, weight, bloodgroup;
	int age;
	double sallary;

	Person(String name, int age, String address, String qualificaton, String height, String weight, String bloodgroup,
			double sallary) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.qualificaton = qualificaton;
		this.height = height;
		this.weight = weight;
		this.bloodgroup = bloodgroup;
		this.sallary = sallary;
	}

	void display() {
		System.out.println("Name             : " + name);
		System.out.println("Age              : " + age);
		System.out.println("Address          : " + address);
		System.out.println("Qualificaton     : " + qualificaton);
		System.out.println("Height           : " + height);
		System.out.println("Weight           : " + weight);
		System.out.println("Blood Group      : " + bloodgroup);
		System.out.println("Sallary          : " + sallary + " TK");
	}

	void studentInfo1() {
		System.out.println("Name             : " + name);
		System.out.println("Age              : " + age);
	}

	void studentInfo2() {
		System.out.println("Height           : " + height);
		System.out.println("Weight           : " + weight);
		System.out.println("Blood Group      : " + bloodgroup);
	}
}

class Student extends Person {
	int id;
	String department, program;
	double cgpa, classpercetange;

	Student(String name, int age, String address, String qualificaton, String height, String weight, String bloodgroup,
			double sallary, int id, String department, String program, double cgpa, double classpercentage) {

		super(name, age, address, qualificaton, height, weight, bloodgroup, sallary);
		this.id = id;
		this.department = department;
		this.program = program;
		this.cgpa = cgpa;
		this.classpercetange = classpercentage;

	}

	@Override
	void display() {

		studentInfo1();
		System.out.println("ID               : " + id);
		System.out.println("Department       : " + department);
		System.out.println("Program          : " + program);
		System.out.println("Class Percetange : " + classpercetange + "%");
		System.out.println("Cgpa             : " + cgpa);
		studentInfo2();
	}
}

class Employ extends Person {
	String jobDuration;

	Employ(String name, int age, String address, String qualificaton, String height, String weight, String bloodgroup,
			double sallary, String jobDuration) {
		super(name, age, address, qualificaton, height, weight, bloodgroup, sallary);
		this.jobDuration = jobDuration;
	}

	@Override
	void display() {

		super.display();
		System.out.println("Job Duration     : " + jobDuration);
	}
}

class Doctor extends Employ {
	String medicalname;

	Doctor(String name, int age, String address, String qualificaton, String height, String weight, String bloodgroup,
			double sallary, String jobDuration, String medicalname) {
		super(name, age, address, qualificaton, height, weight, bloodgroup, sallary, jobDuration);
		this.medicalname = medicalname;
	}

	@Override
	void display() {
		System.out.println("                Doctor Infromation        ");
		System.out.println("               --------------------        \n");
		System.out.println("Medicale Name    : " + medicalname);
		super.display();
	}
}

public class IdentyfyRecord {
	public static void main(String[] args) {

		System.out.println("                Student Infromation        ");
		System.out.println("               ---------------------        \n");
		Student s1 = new Student("Akbar Sami", 20, "Hathazari,Chittagong", " ", "5.4feet", "55 KG", "O+", 0.0, 2253,
				"CSE", "BSc In CSE", 3.40, 98);
		s1.display();
		System.out.println("\n");

		System.out.println("                Employ Infromation        ");
		System.out.println("               --------------------        \n");
		Employ e1 = new Employ("Ali Mortuza", 22, "Chadgaon", "HSC", "5.3Feet", "70 KG", "O+", 50000, "10AM to 10PM");
		e1.display();
		System.out.println("\n");

		Employ e2 = new Doctor("Dr.Arzu", 40, "Chadgaon", "MBBS", "5.5Feet", "68 KG", "AB+", 1500000, "10AM to 11PM",
				"Chittagong Medical College"); // this is runtime polymorphism
		e2.display();
		System.out.println("\n");

		System.out.println("                Person Infromation        ");
		System.out.println("               --------------------        \n");
		Person p1 = new Student("Sakib Chowdury", 21, "Hathazari,Chittagong", " ", "5.2feet", "65 KG", "A+", 0.0, 2241,
				"CSE", "BSc In CSE", 3.00, 99); // this is runtime polymorphism
		p1.display();
	}
}
