package by.epam.jonline.module01;

import java.util.Scanner;

/*
Для данной области составить программу, которая печатает true, если точка с координатами (x, y)
принадлежит закрашенной области, и false - в противном случае
 */

public class Task06 {

	public static void main(String[] args) {
		
		int x;
		int y;
		
		System.out.println("Программа определяет, принадлежит ли точка закрашенной области");
		System.out.println("");
		
		x = console('x');
		y = console('y');
		
if ((x >= -4) && (x <= 4)) {
			if ((y >= -3) && (y <= 0)) {
				System.out.println("True");
			}
			else if ((x>=-2) && (x<=2)) {
				if ((y >= -3) && (y <= 4)) {
					System.out.println("True");
				}
				else System.out.println("False");
			}
			else System.out.println("False");
		}
		else System.out.println("False");
		
	}
	
	public static int console(char c) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("Введите "+c+"-координату точки >> ");
		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.print("Введите "+c+"-координату точки >> ");
		}
		return scanner.nextInt();
		
	}
}
