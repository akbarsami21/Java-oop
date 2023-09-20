package inheritance;

class A1{
	A1(){
		System.out.println("Hello From A Class");
	}
}

class B1 extends A1{
	B1(){
		System.out.println("Hello From B Class");
	}
}

class C1 extends B1{
	C1(){
		System.out.println("Hello From C Class");
	}
}
public class Practice {
	public static void main(String[] args) {
		
		C1 ob1=new C1();
		//System.out.println();
	}

}
