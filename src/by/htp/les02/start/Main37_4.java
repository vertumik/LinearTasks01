//• Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4).
//• График функции у = ах2 + bх+ с проходит через заданную точку с координатами (m, n).

package by.htp.les02.start;

public class Main37_4 {

	public static void main(String[] args) {
		int a = 2;
		double b;
		int N = 4;
		if ((-1<N) && (N<5)){
			System.out.println("число " + N + " является степенью числа " + a);
		}else {
			System.out.println("число " + N + " не является степенью числа " + a);
		}
		b = Math.pow(a, N);
				System.out.println("Результат вычмсления = " + b);
				
		double m, n;
		int x;
		int y;
		int z;
		m = 4;
		n = 3;
		x = 5;
		y = 7;
		z = 2;
		if (x*m*m-y*m+z == n) {
			System.out.println("График функции у = ах2 + bх+ с проходит через заданную точку с координатами (m, n)");
		}else {
			System.out.println("График функции у = ах2 + bх+ с не проходит через заданную точку с координатами (m, n)");
		}
		
	}
		
}
