//• Сумма цифр данного трехзначного числа N является четным числом.


package by.htp.les02.start;

public class Main37_1 {

	public static void main(String[] args) {
		int N = 436;
		int x = 0;
		for (int i = 1; i < 4; i ++) {
			int d = N % 10;
			N = N / 10;
			x = x + d;
		}
		if (x % 2 == 0) {
			System.out.println("Сумма цифр данного трехзначного числа N является четным числом.");
		}else {
			System.out.println("Сумма цифр данного трехзначного числа N является не четным числом.");
		}
		
	}

}
