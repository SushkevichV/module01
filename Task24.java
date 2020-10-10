package by.epam.jonline.module01;

/* Модуль 1. Циклы. Задача 4
 * Найти произведение квадратов первых двухсот чисел
 */
public class Task24 {

	public static void main(String[] args) {
		long i;
		long x;
		x = 1;
		
		for (i=1; i<=200; i++) {
			if(x<9223372036854775807L/Math.pow(12, 2)) {
				x*=Math.pow(i, 2);
			}
			else {
				break;
			}
		}
		
		System.out.println("Произведение квадратов первых "+(i-1)+" чисел равна " + x);
		System.out.println("Дальнейшие вычисления выходят за границы примитивных типов.");

	}

}
