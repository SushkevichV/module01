package by.epam.jonline.module01;

import java.util.Scanner;

/* Модуль 1. Линейные программы. Задача 4
Дано действительное число R вида nnn.ddd (три цифровых разряда в целой и дробной частях)
Поменять местами целую и дробную части и вывести полученное значение числа.
 */

public class Task04 {

	public static void main(String[] args) {
	
		double num;
		double num1;
		double num2;
		
		num = 0;
		
		System.out.println("Замена местами целой и дробной частей числа");
		System.out.println("");
		
		while ((num < 100) || (num > 999.999)) {
			num = console();
		}
		
		num1=(int)num;
		num2=Math.round((num-num1)*1000);
		num1/=1000;
				
		System.out.println((num2+num1));
	}	
	
	public static double console() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("Введите число с тремя знаками в целой и тремя знаками в дробной частях >> ");
		while (!scanner.hasNextDouble()) {
			scanner.next();
			System.out.print("Введите число с тремя знаками в целой и тремя знаками в дробной частях >> ");
		}
		return scanner.nextDouble();
		
	}
}