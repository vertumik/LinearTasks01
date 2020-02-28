//• Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= m, х= n (m<n).
//• Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.

package by.htp.les02.start;

public class Main37_2 {

	public static void main(String[] args) {
		int x;
		int m;
		int n;
		x = 4;
		m = 1;
		n = 9;
		if ((m <= x) && (x <= n)) {
			System.out.println("Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми m, n (m<n)");
			
		}else {
			System.out.println("Точка с координатами (х, у) не принадлежит части плоскости, лежащей между прямыми m, n (m<n)");
		}
		
		int a = 234;
		int temp;
		int sum = 0;
		double b;
		double d;
		b = Math.pow(a, 2);
		for (int i = 1; i < 4; i++) {
			temp = a % 10;
			a = a / 10;
			sum += temp;
		}
		d = Math.pow(sum, 3);
		if (b == d) {
			System.out.println("Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа");
		}else {
			System.out.println("Квадрат заданного трехзначного числа не равен кубу суммы цифр этого числа");
		}
		
		
		
		

	}

}
