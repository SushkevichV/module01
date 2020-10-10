package by.epam.jonline.module01;

import java.util.Scanner;

/* Модуль 1. Линейные программы. Задача 3
Вычислиить значение выражения по формуле 
(sin x + cos y) / (cos x - sin y) * tg xy
 */

public class Task03 {

	public static void main(String[] args) {

		double x;
		double y;
		double result;
		
		System.out.println("Вычисление значения выражения по формуле");
		System.out.println("");
		
		x = console('x');
		y = console('y');
		
		result=(Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y);

		System.out.println("");
		System.out.println("Значение выражения = " +result);

	}
	
	public static double console(char c) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("Введите число " + c +" >> ");
		while (!scanner.hasNextDouble()) {
			scanner.next();
			System.out.print("Введите число " + c +" >> ");
		}
		return scanner.nextDouble();
	}

}
