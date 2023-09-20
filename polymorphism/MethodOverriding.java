package polymorphism;

class Worker{
	String name;
	int age;
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Age  : "+age);
	}
}
class Sakib extends Worker{
	//name,age,display()
	String quali;
	@Override
	void display() {
		super.display();
		System.out.println("Quali:"+quali);
	}
	
	
}
public class MethodOverriding {
	public static void main(String[] args) {
		
		Sakib ob=new Sakib();
		ob.name="Sakib";
		ob.age=21;
		ob.quali="BSc in Cse";
		ob.display();
		
	}

}
