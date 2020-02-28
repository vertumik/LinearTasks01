//Вычислить расстояние между двумя точками с данными координатами (x1, y1) и (x2, y2)

package by.htp.les02.start;

public class Main12 {

	public static void main(String[] args) {
		double x1;
		double x;
		double y;
		double y1;
		double x2;
		double y2;
		double temp;
		double R;
		x1 = 2;
		x2 = 1;
		y1 = 8;
		y2 = 5.5;
		x = x2 - x1;
		y = y2 - y1;
		temp = Math.pow(x, 2) + Math.pow(y, 2);
		R = Math.sqrt(temp);
		System.out.println("Расстояние между двумя точками = " + R);
	}

}
