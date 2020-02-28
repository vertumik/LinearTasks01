//Написать код для решения задачи.
//В n малых бидонах 80л молока.
//Сколько литров молока в m больших бидонах,
//если в каждом большом бидоне на 12л больше, чем в малом.

package by.htp.les02.start;

public class Main6 {

	public static void main(String[] args) {
		int n;
		int m;
		int bidn;
		int bidm;
		int sum;
		n = 20;
		m = 50;
		bidn = 80 / n; //молока в одном малом бидоне
		bidm = bidn + 12; //молока в одном большом бидоне
		sum = bidm * m; //количество молока в большихх бидонах
		System.out.println("В " + m + " больших бидонах " + sum + " литров молока");

	}

}
