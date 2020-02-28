//Заданы координаты трех вершин треугольника (x1, y1), (x2, y2), (x3, y3)
//Найти его периметр и площадь

package by.htp.les02.start;

public class Main13 {

	public static void main(String[] args) {
		double x1;
		double x2;
		double x3;
		double y1;
		double y2;
		double y3;
		double tempx1;
		double tempy1;
		double tempx2;
		double tempy2;
		double tempx3;
		double tempy3;
		double AB;
		double BC;
		double AC;
		double P;
		double p1;
		double p2;
		double p3;
		double p4;
		double tempp;
		double S;
		//Координаты вершин
		x1 = 1;
		y1 = 33;
		x2 = 2;
		y2 = -5;
		x3 = -8;
		y3 = 4;
		//Сторона АВ
		tempx1 = x2 - x1;
		tempy1 = y2 - y1;
		AB = Math.pow(tempx1, 2) + Math.pow(tempy1, 2);
		AB = Math.sqrt(AB);
		//Сторона ВС
		tempx2 = x3 - x2;
		tempy2 = y3 - y2;
		BC = Math.pow(tempx2, 2) + Math.pow(tempy2, 2);
		BC = Math.sqrt(BC);
		//Сторона АС
		tempx3 = x3 - x1;
		tempy3 = y3 - y1;
		AC = Math.pow(tempx3, 2) + Math.pow(tempy3, 2);
		AC = Math.sqrt(AC);
		//Периметр треугольника
		P = AB + BC + AC;
		//Площадь треугольника
		p1 = x1 - x3;
		p2 = y2 - y3;
		p3 = x2 - x3;
		p4 = y1 - y3;
		tempp = p1 * p2 - p3 * p4;
		S = 0.5 * Math.abs(tempp);
		//Вывод значений на экран
		System.out.println("Периметр треугольника = " + P + " площадь треугольника = " + S);

	}

}
