package by.epam.jonline.module01;

import java.util.Scanner;

/*
Найдите значение функции: z=((a-3)*b/2)+c
 */
public class Task01 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		double result;
		
		System.out.println("Нахождение значения функции: z=((a-3)*b/2)+c");
		System.out.println("");
		a = console('a');
		b = console('b');
		c = console('c');

		result=((a-3)*b/2)+c;
		System.out.println("");
		System.out.println("z = " +result);

	}
	
	public static double console(char x) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("Введите " + x +" >> ");
		while (!scanner.hasNextDouble()) {
			scanner.next();
			System.out.print("Введите число " + x +" >> ");
		}
		return scanner.nextDouble();
	}

}
