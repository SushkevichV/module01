package by.epam.jonline.module01;

 /*
  * Найти сумму квадратов первых ста чисел
  */

public class Task23 {

	public static void main(String[] args) {
		int i;
		int sum;
		sum = 0;
		
		for (i=1; i<=100; i++) {
			sum+=Math.pow(i, 2);
		}
		
		System.out.println("Сумма квадратов первых ста чисел равна " + sum);

	}

}
