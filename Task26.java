package by.epam.jonline.module01;

/* Модуль 1. Циклы. Задача 6
 * Вывести на экран соответствия между символамии их численными обозначениями в памяти компьютера
 */

public class Task26 {

	public static void main(String[] args) {
		int i;
		
		System.out.println("Символ - код");
				
		for (i=0; i<256; i++) {
			System.out.println((char)i + " - " + i);
		}
	}

	
}
