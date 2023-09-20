package inheritance;

class Fan {
	String company,color;
	int price,hand;
	
	Fan(String company,String color){
		this.company=company;
		this.color=color;
	}
	
	void printInfo1() {
		System.out.println("Company Name: "+company);
		System.out.println("Colour      : "+color);
	}
	
	Fan(String company,String color,int price,int hand){
		this(company, color);
		this.price=price;
		this.hand=hand;
	}
	
	void printInfo2() {
		this.printInfo1();
		System.out.println("Price       : "+price);
		System.out.println("Hand        : "+hand);
		
	}
}
public class ThisKeywod {
	public static void main(String[] args) {
		
		Fan f1=new Fan("KB Fan","Green");
		f1.printInfo1();
		System.out.println("\n");
		
		Fan f2=new Fan("PHP Fan","Red",4200,4);
		f2.printInfo2();
	}

}
