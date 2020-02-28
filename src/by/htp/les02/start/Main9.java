//Вычислить значение по формуле (все переменные принимают действительные значения)

package by.htp.les02.start;

public class Main9 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;
		double t;
		a = 6;
		b = 4;
		c = 3;
		d = 2;
		t = (a / c) * (b / d);
		t = t - (((a * b - c)) / (c * d));
		System.out.println("Значение по формуле = " + t);

	}

}
