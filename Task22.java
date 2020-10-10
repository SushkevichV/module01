package by.epam.jonline.module01;

/* Модуль 1. Циклы. Задача 2
 * Вычислить значение функции на отрезке [a,b] с шагом h
 */

public class Task22 {

	public static void main(String[] args) {
		int a;
		int b;
		int h;
		int x;
		
		a = -10;
		b = 10;
		h = 2;
		
		System.out.println("Вычислить значение функции на отрезке ["+a+","+b+"] с шагом "+h);
		
		for (x=a; x<=b; x+=h) {
			if (x>2) {
				System.out.println("x = " + x + ", y = " + x);
			}
			else {
				System.out.println("x = " + x + ", y = " + -x);
			}
		}

	}

}
