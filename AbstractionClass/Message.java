package AbstractionClass;

abstract class MakeMassage{ //abstract class er age abstract keyword dite hobe
	void Call() {
		System.out.println("Call Method");
	}
	abstract void SendMassage(); //abstract method er kuno body nai
}

class Sami extends MakeMassage{
	
	@Override
	void SendMassage(){   /*abstract class extend korle must abstract method override korte
	                        hobe otoba extend class er age abstract keyword use korte  hobe*/
		
		System.out.println("Hello,I Am Sami");
	}
}

class Saikat extends Sami{
	
	@Override
	void SendMassage() {  /*abstract class extend korle must abstract method override korte
                            hobe otoba extend class er age abstract keyword use korte  hobe*/
		
		System.out.println("Hello,I Am Saikat");
	}
}
public class Message {
  public static void main(String[] args) {
	
	  MakeMassage m; /*abstract class kuno object create kora jai na but reference variable 
	                   make kora jai,sei variable diye polymorphism kore kaj kora jai*/
	  m=new Sami();
	  m.Call();
	  m.SendMassage();
	  
	  m=new Saikat();
	  m.Call();
	  m.SendMassage();
}
}

