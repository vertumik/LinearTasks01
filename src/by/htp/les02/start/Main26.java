//Найди площадь треугольника, две стороны которого равны a и b, а угол между ними у

package by.htp.les02.start;

public class Main26 {

	public static void main(String[] args) {
		double a;
		double b;
		double y;
		double S;
		a = 5;
		b = 4;
		y = 35;
		S = 0.5 * a * b * Math.sin(y);
		System.out.println("Площадь треугольника = " + S);

	}

}
