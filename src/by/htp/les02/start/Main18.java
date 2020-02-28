//Дана длина ребра куба
//Найти площадь грани, площадь полной поверхности и объем этого куба

package by.htp.les02.start;

public class Main18 {

	public static void main(String[] args) {
		double l;
		l = 5;
		double S;
		double Sfull;
		double V;
		S = l * l;
		Sfull = 6 * Math.pow(l, 2);
		V = Math.pow(l, 3);
		System.out.println("Площадь грани = " + S + " площадь поверхности = " + Sfull + " объем куба = " + V);

	}

}
