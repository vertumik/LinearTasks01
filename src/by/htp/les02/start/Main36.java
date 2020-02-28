//Найти частное произведений четных и нечетных цифр четырехзначного числа.

package by.htp.les02.start;

public class Main36 {

	public static void main(String[] args) {
		int num;
		int Odd = 1;
        int Even = 1;
        
        num = 1234;
        for (int i = 1; i < 5; i++) {
            int d = num % 10;
            num /= 10;
            if (d % 2 == 0) {
                Even *= d;
            } else {
                Odd *= d;
            }
        }
        
      System.out.println("Частное произведений суммы четных и нечетных цифр " + (double)Even / (double)Odd);
		

	}


}
