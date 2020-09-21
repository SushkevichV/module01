package by.epam.jonline.module01;

import java.util.Scanner;

/*
 * Программа суммирует все числа от 1 до введенного пользователем числа
 */

public class Task21 {

	public static void main(String[] args) {
		int i;
		int x;
		int sum;
		
		i = 0;
		sum = 0;
				
		System.out.println("Программа суммирует все числа от 1 до введенного пользователем числа");
		System.out.println();
		
		while (i<1)
			i=console();
		
		for (x=1; x<=i; x++) {
			if (x>2147483647-sum) {
				System.out.println("Число слишком большое!");
				break;
			}
			else
				sum+=x;
		}
		
		System.out.println("Сумма чисел от 1 до " + (x-1) + " = " + sum); // Если сумма превысит предел Int, вывести сумму чисел от 1 до числа,
																		  // на котором произошло переполнение

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
