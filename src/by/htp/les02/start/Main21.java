//Дано действительное число R вида nnnddd Поменять местами дробную и целую части

package by.htp.les02.start;

public class Main21 {

	public static void main(String[] args) {
		double R;
		R = 234.567;
		double temp;
		double result;
		temp = (int)R;
		result = temp / 1000 + (R - temp) * 1000;
		System.out.printf("%.3f", result);

	}

}
