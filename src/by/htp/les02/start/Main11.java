//Вычислить периметр и площадь прямоугольного треугольника по длинам a и b двух катетов

package by.htp.les02.start;

public class Main11 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double P;
		double S;
		a = 3;
		b = 4;
		c = Math.pow(a, 2) + Math.pow(b, 2); //квадрат гипотенузы
		c = Math.sqrt(c); //гипотенуза
		P = a + b + c; //периметр прямоугольного треугольника
		S = a * b / 2; //площадь прямоугольного треугольника
		System.out.println("Периметр P = " + P + ", площадь S = " + S);

	}

}
