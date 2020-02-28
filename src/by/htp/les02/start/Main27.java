//Дано значение а. Не используя никаких функций и операций, кроме уменожения, получить а в 5
// за три операции и а в 10 за четыре операции

package by.htp.les02.start;

public class Main27 {

	public static void main(String[] args) {
		int a;
		int b;
		b = 2;
		a = 2;
		a = a * a;
		a = a * a;
		a = a * 2;
		System.out.println("а в пятой степени = " + a);
		b = b * b;
		b = b * b;
		b = b * 2;
		b = b * b;
		System.out.println("b в десятой степени = " + b);

	}

}
