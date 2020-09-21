package by.epam.jonline.module01;

import java.util.Scanner;

/*
 * Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа
 */

public class Task27 {

	public static void main(String[] args) {
		int m;
		int n;
		int i;
		int j;
		
		System.out.println("Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа");
		System.out.println();
		m = console();
		n = console();
				
		for (i=m; i<=n; i++) {
			System.out.print("Делители числа "+ i +" : ");
			for (j=2; j<i; j++) {
				if (i%j==0)
					System.out.print(j +" ");
			}
			System.out.println();
		}

	}
	
	public static int console() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Введите положительное целое число >> ");
		while (!scanner.hasNextInt()) { 
			scanner.next();
			System.out.print("Введите положительное целое число >> ");
		}
		
		return scanner.nextInt();
	}

}
