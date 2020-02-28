//Вычислить значение по формуле (все переменные принимают действительные значения)

package by.htp.les02.start;

public class Main8 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double t;
		a = 4;
		b = 4;
		c = 2;
		t = b + Math.sqrt(b*b+4*a*c);
		t = t / (2*a);
		t = t - Math.pow(a, 3) * c;
		t = t + Math.pow(b, -2);
		System.out.println("Значение по формуле = " + t);

	}

}
