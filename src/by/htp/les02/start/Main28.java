//Составить программу перевода радианной меры угла в градусы, минуты и секунды

package by.htp.les02.start;

public class Main28 {

	public static void main(String[] args) {
		double ar;
		double ad;
		double temp;
		double temp2;
		double m;
		double s;
		ar = 35;
		ad = ar * 180 / Math.PI;
		temp = ad - (int)ad;
		m = temp * 60;
		temp2 = m - (int) m;
		s = temp2 * 60;
		System.out.println("Градусов " + (int)ad + " минут " + (int)m + " секунд " + (int)s);

	}

}
