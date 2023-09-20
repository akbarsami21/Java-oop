package inheritance;

class Apple{
	int x=10;
	
	Apple(){
		System.out.println("Apple Class");
	}  
	
	void print() {
		System.out.println("Total Apple: "+x);
	}
	
	void display() {
		System.out.println("Inside of Apple Class");
	}
	
}
class Orrange extends Apple{
	int x=20;
	
	Orrange(){  //super keyword use in constructor
		super();
		System.out.println("Orrange Class");
	}
	
	@Override //super keyword use in varible 
	void print() {
		System.out.println("\nTotal Apple: "+x);
		System.out.println("Total Apple: "+super.x +"\n");
	}
	
	
	@Override //super keyword use in method
	void display() {
		super.display();
		System.out.println("Inside Of Orange Class");
	}
	
}
public class SuperClass {
 public static void main(String []args) {
	 
	 Orrange ob=new Orrange();
	 ob.print();
	 ob.display();
 }
}
