package inheritance;

class Employ{
	final String name="Akbar Sami";
	final int age;
	Employ(){
		age=20;
	}
	static final String fathername,mothername;
	static {
		fathername="Md Azam Khan";
		mothername="Shanaz Begum";
	}
	final void display() {
		System.out.println("Name        : "+name);
		System.out.println("Age         : "+age);
		System.out.println("Father Name : "+fathername);
		System.out.println("Mother Name : "+mothername);
	}
}
class Employ2 extends Employ{
	//name,age,fathername,mothername,display() are inherit here
	
	/*@Override
	void display() {
		System.out.println("Inside of Employ2 Class");
		
		//error asbe casue final method ke override kora jai na but inherit kora jai 
	} */
}

final class Employ3{
	//ei class ta ke kio inherit ba extends korte parbe na cause eti final class
}

public class final_method {
 public static void main(String[] args) {
	
	 Employ2 e=new Employ2();
	 e.display();
	 
}
}
