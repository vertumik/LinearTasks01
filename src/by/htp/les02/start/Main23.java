//Найти площадь кольца, внутренний радиус которого равен r, а внешний  - R (R>r)

package by.htp.les02.start;

public class Main23 {

	public static void main(String[] args) {
		double R;
		double r;
		double S;
		R = 15;
		r = 8;
		S = Math.PI * (Math.pow(R, 2) - Math.pow(r, 2));
		System.out.println("Площадь кольца = " + S);
		

	}

}
