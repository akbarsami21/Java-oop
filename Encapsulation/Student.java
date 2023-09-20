package Encapsulation;

public class Student {
	private String id,name,fname,mname,add,phoneNum,booldG;
	private static String program,session,validUntil;
	static {
		program="B.Sc. in C.S.E";
		session="Fall 2021";
		validUntil="Spring 2025";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getBooldG() {
		return booldG;
	}
	public void setBooldG(String booldG) {
		this.booldG = booldG;
	}
	
	public void printInfo(){
		System.out.println("Program     : "+program);
		System.out.println("Session     : "+session);
		System.out.println("Valid Until : "+validUntil);
	}
	
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setId("210");
		s1.setName("X");
		s1.setFname("Y");
		s1.setMname("Z");
		s1.setAdd("Hathazari,Chittagong");
		s1.setPhoneNum("01234567891");
		s1.setBooldG("O+");
		
		System.out.println("      Premier University   ");
		System.out.println("     --------------------   \n");
		System.out.println("Student ID  : "+s1.getId());
		System.out.println("Name        : "+s1.getName());
		s1.printInfo();
		System.out.println("Father      : "+s1.getFname());
		System.out.println("Mother      : "+s1.getMname());
		System.out.println("Address     : "+s1.getAdd());
		System.out.println("Phone       : "+s1.getPhoneNum());
		System.out.println("Blood Group : "+s1.getBooldG());
		
	}
}
