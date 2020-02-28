//Дано значение х. Получить значения -2х + 3х - 4х и 1 + 2х + 3х + 4х . Позаботьтесь об экономии операций.

package by.htp.les02.start;

public class Main40 {

	public static void main(String[] args) {
		int x;
		x = 2;
		int y;
		int y2;
		y = x * (-2 + 3 - 4);
		y2 = 1 + x * (2 + 3 + 4);
		System.out.println("Результат вычислений = " + y);
		System.out.println("Результат вычислений = " + y2);

	}

}
