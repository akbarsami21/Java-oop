package inheritance;

class per{ //final variable
	 String name="Akbar Sami";
	int age;
	
	void print() {
		//name="Sami"; hobena karon final variable modify kora jai na
		System.out.println("Per Object");
		System.out.println("Name : "+name);
	}
}
class Tea extends per{
	
	final int age; //final blank variable eti
	
	Tea(){ //final blank variable initialize korte constructor er modde korte hobe
		age=20;
	}
	@Override
	void print() {
		System.out.println("\nTea Object");
		System.out.println("Age  : "+age);
	}
}

class Stu extends Tea{
	static final int id; //static final blank variable eti
	
	static {  //final blank variable initialize korte static block er modde korte hobe
		id=2253;
	}
	@Override
	void print() {
		System.out.println("\nStu Object ");
		System.out.println("Id   : "+id);
	}
}

public class final_keyword {
 public static void main(String[] args) {
	
	 per p=new per();
	 p.print();
	 
	 Tea t=new Tea();
	 t.print();
	 
	 Stu s=new Stu();
	 s.print();
}
}
