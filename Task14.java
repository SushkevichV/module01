package by.epam.jonline.module01;

import java.util.Scanner;

/*
Заданы размеры прямоугольного отверстия и размеры кирпича. Определить, пройдет ли
кирпич через отверстие. 
*/

public class Task14 {

	public static void main(String[] args) {
		int x;
		int y;
		int z;
		int a;
		int b;
								
		x=(int)(1+Math.random()*10);
		y=(int)(1+Math.random()*10);
		z=(int)(1+Math.random()*10);
				
		System.out.println("Проверяет, пройдет ли кирпич через отверстие");
		System.out.println();
		System.out.println("Размеры кирпича " + x + " Х " + y + " Х " + z);
		System.out.println();
		
		a=console("высоту");
		b=console("ширину");
		
		if ((a>=x) && (b>=y))  
			System.out.println("Кирпич проходит через отверстие");
		else
		if ((a>=x) && (b>=z))  
			System.out.println("Кирпич проходит через отверстие");
		else
		if ((a>=y) && (b>=z))  
			System.out.println("Кирпич проходит через отверстие");
		else
		if ((a>=y) && (b>=x))  
			System.out.println("Кирпич проходит через отверстие");
		else
		if ((a>=z) && (b>=x))  
			System.out.println("Кирпич проходит через отверстие");
		else
		if ((a>=z) && (b>=y))  
			System.out.println("Кирпич проходит через отверстие");
		else
			System.out.println("Кирпич не проходит через отверстие");

	}

	public static int console(String s) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("Введите "+s+" отверстия >> ");
		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.print("Введите "+s+" отверстия >> ");
		}
		return scanner.nextInt();
		
	}
}
