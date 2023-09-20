package Interface;

interface Functionaliy {
	double avg(double... num);
}

class Avg implements Functionaliy {

	public double avg(double... num) {

		double sum = 0;
		for (double x : num) {
			sum = sum + x;
		}
		double avg = sum / num.length;
		return avg;
	}
}

public class Average {

	public static void main(String[] args) {
		Avg ob = new Avg();
		System.out.println("Average : " + ob.avg(10, 20, 30, 40, 50));
	}

}
