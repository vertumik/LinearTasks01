//Даны натуральные числа M и N
//Вывести старшую цифру дробной части и младшую цифру целой части числа M/N

package by.htp.les02.start;

public class Main35 {

	public static void main(String[] args) {
		double M;
		double N;
		double R;
		int y;
		int x;
		int k;
		
		M = 275;//произвольное значение 
		N = 9;//произвольное значение
		
		R = M/N;
		
		x = (int) R;
		y = x % 10;
		R = R - x;
		R = R * 10;
		k = (int) R;
			
		System.out.println("Старшая цифра дробной части " + y);
		System.out.println("Младшая цифра дробной части " + k);
		

	}

}
