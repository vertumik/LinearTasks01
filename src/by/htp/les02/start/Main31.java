//Составить программу для вычисления пути, пройденного лодкой
//если ее скорость в стоячей воде у км/ч
//скорость течения реки у1 км/ч
//время движения по озеру т1 ч
//а против течения реки т2 ч

package by.htp.les02.start;

public class Main31 {

	public static void main(String[] args) {
		double v;
		double v1;
		double t1;
		double t2;
		double result;
		v = 10;
		v1 = 2;
		t1 = 3;
		t2 = 5;
		result = t1 * v + t2 * (v - v1);
		System.out.println("Путь, пройденный лодкой = " + (int)result);
		

	}

}
