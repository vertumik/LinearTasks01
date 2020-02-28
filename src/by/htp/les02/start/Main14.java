//Вычислить длину окружности и площадь круга одного и того же заданного радиуса R

package by.htp.les02.start;

public class Main14 {

	public static void main(String[] args) {
		double R;
		double d;
		double L;
		double P;
		R = 4;
		d = R * 2;
		L= Math.PI * d;
		System.out.println("Длина окружности = " + L);
		P = Math.pow(L, 2) / (4 * Math.PI);
		System.out.println("Площадь круга = " + P);
		

	}

}
