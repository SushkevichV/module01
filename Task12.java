package by.epam.jonline.module01;

/* Модуль 1. Ветвления. Задача 2
 Найти max{min(a, b), min(c, d)} 
 */

public class Task12 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		
		a=(int)(Math.random()*1000);
		b=(int)(Math.random()*1000);
		c=(int)(Math.random()*1000);
		d=(int)(Math.random()*1000);
		
		System.out.println("Находит max{min(a, b), min(c, d)} из случайных чисел в диапазоне от 0 до 1000");
		System.out.println();
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println();
		
		if (a>b) {
			a=b;
		}
		
		if (c>d) {
			c=d;
		}
		
		if (a<c) {
			a=c;
		}
		
		System.out.println("max{min(a, b), min(c, d)} = " + a);

	}

}
