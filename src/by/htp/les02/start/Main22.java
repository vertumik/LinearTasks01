//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
//Вывести данное значение длительности в часах, минутах и секундах в след. форме HHч ММмин SSс

package by.htp.les02.start;

public class Main22 {

	public static void main(String[] args) {
		int T;
		int H;
		int M;
		int S;
		T = 2354;
		H = T / 3600;
		M = Math.abs(H * 3600 - T) / 60;
		S = T % 60;
		System.out.println("HHч: " + H + " MMмин: " + M + " Sс: " + S);

	}

}
