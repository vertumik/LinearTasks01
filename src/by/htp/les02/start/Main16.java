//Найти произведение цифр заданного четырехзначного числа

package by.htp.les02.start;

public class Main16 {

	public static void main(String[] args) {
		int i;
		i = 2345;
		int sum;
		sum = 0;
		int temp;
		temp = i % 10;
		sum = temp;
		
		i = i / 10;
		temp = i % 10;
		sum = sum * temp;
		
		i = i / 10;
		temp = i % 10;
		sum = sum * temp;
		
		i = i / 10;
		sum = sum * i;
		
		System.out.println("Произведение заданного числа = " + sum);

	}

}
