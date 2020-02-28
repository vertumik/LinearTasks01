//Дана величина А выражающая объем информации в байтах
//Перевести А в более крупные еденицы измерения информации

package by.htp.les02.start;

public class Main34 {

	public static void main(String[] args) {
		double i;
		i = 128;
		i = i / 1024;
		System.out.println("Ваше значение " + i + " Кбайт");
		i = i / 1024;
		System.out.println("Ваше значение " + i + " Мбайт");
		i = i / 1024;
		System.out.println("Ваше значение " + i + " Гбайт");
		i = i / 1024;
		System.out.println("Ваше значение " + i + " Тбайт");

	}

}
