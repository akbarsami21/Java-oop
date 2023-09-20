package inheritance;

public class Person {
	String name, Fname, Mname, PhoneNum, BloodGroup, email, id, address;

	void getStudentInfo(String name, String id, String Fname, String Mname, String email, String PhoneNum,
			String BloodGroup, String address) {
		this.name = name;
		this.id = id;
		this.Fname = Fname;
		this.Mname = Mname;
		this.email = email;
		this.PhoneNum = PhoneNum;
		this.BloodGroup = BloodGroup;
		this.address = address;
	}

	void printStudentInfo() {
		System.out.println("Name         : " + name);
		System.out.println("ID           : " + id);
		System.out.println("Father Name  : " + Fname);
		System.out.println("Mother Name  : " + Mname);
		System.out.println("Email        : " + email);
		System.out.println("Phone Number : " + PhoneNum);
		System.out.println("Blood Group  : " + BloodGroup);
		System.out.println("Address      : " + address);
	}
}