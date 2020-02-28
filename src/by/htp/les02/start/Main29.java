//Найти (в радианах в градусах) все углы треугольника a, b, c

package by.htp.les02.start;

public class Main29 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double alpha;
		double betta;
		double gamma;
		double temp;
		a = 4;
		b = 3;
		c = 5;
		temp = (a*a + c*c - b*b) / (2*a*c);
		alpha = Math.cos(temp);
		temp = (a*a + b*b - c*c) / (2*a*b);
		betta = Math.cos(temp);
		temp = (b*b + c*c - a*a) / (2*b*c);
		gamma = Math.cos(temp);
		System.out.println("Угол alpha в радианах = " + alpha);
		System.out.println("Угол betta в радианах = " + betta);
		System.out.println("Угол gamma в радианах = " + gamma);
		alpha = alpha * 180 / Math.PI;
		betta = betta * 180 / Math.PI;
		gamma = gamma * 180 / Math.PI;
		System.out.println("Угол alpha в градусах = " + (int)alpha);
		System.out.println("Угол betta в градусах = " + (int)betta);
		System.out.println("Угол gamma в градусах = " + (int)gamma);
		
	}

}
