//Три сопротивления r1, r2, r3 соединены параллельно
//Найдите сопротивление соединения

package by.htp.les02.start;

public class Main30 {

	public static void main(String[] args) {
		double r1;
		double r2;
		double r3;
		double resistance;
		r1 = 5;
		r2 = 6;
		r3 = 3;
		resistance = 1/((1/r1)+(1/r2)+(1/r3));
		System.out.println("Сопротивление соединения = " + resistance);

	}

}
