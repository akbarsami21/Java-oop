package inheritance;

public class Student extends Person {
	public static void main(String[] args) {

   Student s1=new Student();
   s1.getStudentInfo("X", "210", "Y", "Z",
		             "xy@gamil.com", "01234567891", "O+", "Hathazari,Chittagong");
   s1.printStudentInfo();
}
}
