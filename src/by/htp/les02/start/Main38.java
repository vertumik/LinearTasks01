//Для данных областей составить линейную программу, которая печатает true, 
//если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае

package by.htp.les02.start;

public class Main38 {

	public static void main(String[] args) {
		int x;
		int y;
		x = 2;
		y = 3;
		if ((x >= -4) && (x <= 0) && (y <= 0.5 * x + -4) || (x >= 0) && (x <= 4) && y <= -0.5 * x +4){
			System.out.println("Точка с координатами x, y принадлежит закрашенной области");
		}else {
			System.out.println("Точка с координатами x, y не принадлежит закрашенной области");
		}
		if ((x >= -2) && (x <= 2) && (y <= 4) && (y >= 0) || (x >= -4) && (x <= 4) && (y >= - 3) && (y <= 0)) {
			System.out.println("Точка с координатами x, y принадлежит закрашенной области");
		}else {
			System.out.println("Точка с координатами x, y не принадлежит закрашенной области");
		}

	}

}