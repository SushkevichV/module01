package by.epam.jonline.module01;

import java.util.Scanner;

/* Модуль 1. Ветвления. Задача 1
Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
и если да, то будет ли он прямоугольным.
 */

public class Task11 {

	public static void main(String[] args) {
		int x;
		int y;
		
		System.out.println("Программа определяет, существует ли треугольник");
		System.out.println("");
		
		x = console("первый");
		y = console("второй");
		
		if ((x>0) && (y>0) && (x+y<180)) {
			System.out.println("Треугольник с такими углами существует");
			if ((x==90) || (y==90) || (x+y==90)) {
				System.out.println("Треугольник является прямоугольным");
			}
			else
				System.out.println("Треугольник не является прямоугольным");
		}
		else
			System.out.println("Треугольник с такими углами не существует");
	}
	
	public static int console(String s) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("Введите "+s+" угол >> ");
		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.print("Введите "+s+" угол >> ");
		}
		return scanner.nextInt();
		
	}
}
