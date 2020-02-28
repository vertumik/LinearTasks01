//Дана сторона равностороннего треугольника
//Найти площадь этого треугольника, его высоту, радиусы вписанной и описанной окружностей

package by.htp.les02.start;

public class Main19 {

	public static void main(String[] args) {
		double a;
		double h;
		double S;
		double r;
		double R;
		a = 3;
		double temp;
		temp = Math.pow(a, 2) - Math.pow(a, 2) / 4;
		h = Math.sqrt(temp);
		S = (a / 2) * h;
		r = a / (2 * Math.sqrt(3));
		R = a / Math.sqrt(3);
		System.out.println("Площадь треугольника = " + S);
		System.out.println("Высота треугольника = " + h);
		System.out.println("Радиус вписанной окружности = " + r);
		System.out.println("Радиус описанной окружности = " + R);
	}

}
