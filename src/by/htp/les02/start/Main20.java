//Известна длина окружности
//Найти площадь круга, ограниченного этой окружностью

package by.htp.les02.start;

public class Main20 {

	public static void main(String[] args) {
		double l;
		double d;
		double r;
		double S;
		l = 65; //длина окружности
		d = l / Math.PI; //диаметр
		r = d / 2; //радиус
		S = Math.PI * Math.pow(r, 2);
		System.out.println("Площадь круга = " + S);

	}

}
