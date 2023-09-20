package inheritance;

public class Student extends Person {
	public static void main(String[] args) {

   Student s1=new Student();
   s1.getStudentInfo("Md Ali Akbar Sami", "2104010202253", "Md.Azam Khan", "Shanaz Begum",
		             "mdsami6251@gamil.com", "01720423399", "O+", "Hathazari,Chittagong");
   s1.printStudentInfo();
}
}