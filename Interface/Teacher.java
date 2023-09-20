package Interface;

interface Sallary {
	double sallery = 500000;

	void totalsallery();
}

interface Fee {
	double fee = 25500;

	void totalsallery();
}

class Teacher1 implements Sallary {
	double classpercent;

	Teacher1(double classpercent) {
		this.classpercent = classpercent;
	}

	public void totalsallery() {
		double result = sallery * classpercent;
		System.out.println("Sallery : " + (int) result);
	}
}

class Employ implements Sallary, Fee {

	double classpercentage;

	Employ(double classpercentage) {
		this.classpercentage = classpercentage;
	}

	public void totalsallery() {
		double result = fee * classpercentage;
		System.out.println("Employ Fee : " + result);
	}
}

public class Teacher {
	public static void main(String[] args) {

		Teacher1 sami = new Teacher1(9.85);
		sami.totalsallery();

		Teacher1 saikat = new Teacher1(9.50);
		saikat.totalsallery();

		Teacher1 sakib = new Teacher1(10.0);
		sakib.totalsallery();

		Employ tanvir = new Employ(7.50);
		tanvir.totalsallery();

	}
}
