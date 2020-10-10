package by.epam.jonline.module01;

/* Модуль 1. Циклы. Задача 5
 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше либо равен е.
 */

public class Task25 {

	public static void main(String[] args) {
		double e;
		double sum;
		double n;
		int x;
		
		x = 10;		// Количество членов ряда
		e = 0.25;	// Заданное число
		sum = 0;
		
		for (int i=1; i<=x; i++) {
			n=1/Math.pow(2, i)+1/Math.pow(3, i);
			if (e<=Math.abs(n)) {
				sum+=n;
			}
		}
		
		System.out.println("Сумма членов ряда, модуль которых больше либо равен заданному числу");
		System.out.println(sum);

	}

}
