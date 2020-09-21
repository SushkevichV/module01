package by.epam.jonline.module01;

import java.util.Scanner;

/*
Вычислиить значение выражения по формуле 
 */

public class Task02 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double result;
		
		System.out.println("Вычисление значения выражения по формуле");
		System.out.println("");
		
		a = console('a');
		b = console('b');
		c = console('c');

		result=(b+Math.sqrt(Math.pow(b, 2)+4*a*c))/(2*a)-Math.pow(a, 3)*c+Math.pow(b, -2);

		System.out.println("");
		System.out.println("Значение выражения = " +result);

	}
	
	public static double console(char x) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("Введите число " + x +" >> ");
		while (!scanner.hasNextDouble()) {
			scanner.next();
			System.out.print("Введите число " + x +" >> ");
		}
		return scanner.nextDouble();
	}

}