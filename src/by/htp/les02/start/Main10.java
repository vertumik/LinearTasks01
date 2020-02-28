//Вычислить значение по формуле (все переменные принимают действительные значения)

package by.htp.les02.start;

public class Main10 {

	public static void main(String[] args) {
		double x;
		double y;
		double t;
		x = 240;
		y = 180;
		t = Math.sin(x) + Math.cos(y);
		t = t / (Math.cos(x) - Math.sin(y));
		t = t * (Math.tan(x) * Math.tan(y));
		System.out.println("Значение по формуле = " + t);

	}

}
