//Ввести любой символ и определить его порядковый номер, а так же указать предыдущий и последующий символы

package by.htp.les02.start;

public class Main33 {

	public static void main(String[] args) {
		char ch = 'd';
		int s;
		s = ch;
		
		System.out.println("Порядковый номер символа "+ ch + ": " + s);
		System.out.print("Предыдущий символ: ");
		System.out.println((char)(s - 1));
		System.out.print("Следующий символ: ");
		System.out.println((char) (s + 1));
		

	}

}
