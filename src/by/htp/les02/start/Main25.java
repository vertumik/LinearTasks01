//Вычислить корни квадратного уравнения с заданными коэффициентами a, b и c (предполагается, что а не равно 0 и что дискрименант не отрицателен)

package by.htp.les02.start;

public class Main25 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;
		double x1;
		double x2;
		a = 3;
		b = 8;
		c = 4;
		d = b * b - 4 * a * c;
		if (d > 0) {
			x1 = (-b + Math.sqrt(d)) / (2 * a);
			x2 = (-b - Math.sqrt(d)) / (2 * a);
			System.out.println("Два корня x1 = " + x1 + " x2 = " + x2);
			if (d == 0) {
				x1 = x2 = -b / (2 * a);
				System.out.println ("x1 = x2 =" + x1);
			}
		}
		else {
			System.out.println("Вещественных корней нет");
		}

	}

}
