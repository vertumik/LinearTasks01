//Найти площадь равнобедренной трапеции с основаниями a и b и углом альфа при большем основании a

package by.htp.les02.start;

public class Main24 {

	public static void main(String[] args) {
		double a;
		double b;
		double h;
		double c;
		double S;
		a = 5; //основание
		b = 3; //основание
		c = 38; //угол
		h = (a-b) / 2 * Math.tan(c); //высота
		S = (a+b) / 2 * h;
		System.out.println("Площадь трапеции = " + S);
		

	}

}
