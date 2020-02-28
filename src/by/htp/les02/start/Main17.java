//Даны два числа
//Найти среднее арифметическое кубов этих чисел
//и среднее геометрическое модулей этих чисел

package by.htp.les02.start;

public class Main17 {

	public static void main(String[] args) {
		double x;
		double y;
		double ar;
		double geo;
		x = 3;
		y = 5;
		ar =  (Math.pow(x, 3) + Math.pow(y, 3)) / 2;
		geo = Math.abs(x) * Math.abs(y);
		geo = Math.sqrt(geo);
		System.out.println("Среднее арифметическое кубов чисел = " + ar);
		System.out.print("Среднее геометрическое модулей чисел = " + geo);
	}

}
