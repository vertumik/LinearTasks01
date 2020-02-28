//• Треугольник со сторонами а,b,с является равнобедренным.
//• Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.

package by.htp.les02.start;

public class Main37_3 {

	public static void main(String[] args) {
		int a, b, c;
		a = 4;
		b = 5;
		c = 4;
		if ((a==b) || (b==c) || (a==c)) {
			System.out.println("Треугольник со сторонами а,b,с является равнобедренным");
		}else {
			System.out.println("Треугольник со сторонами а,b,с не является равнобедренным");
		}
		
		int N = 224;
		int x;
		int y;
		int z;
		x = N % 10;
		N = N / 10;
		y = N % 10;
		N = N / 10;
		z = N % 10;
		if ((x+y==z) || (y+z==x) || (z+x==y)) {
			System.out.println("Сумма двух цифр заданного трехзначного натурального числа равна третьей цифре");
		}else {
			System.out.println("Сумма двух цифр заданного трехзначного натурального числа не равна третьей цифре");
		}
		
	}

}
