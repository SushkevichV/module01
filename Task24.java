package by.epam.jonline.module01;

/*
 * Найти произведение квадратов первых двухсот чисел
 */
public class Task24 {

	public static void main(String[] args) {
		long i;
		long x;
		x = 1;
		
		for (i=1; i<=12; i++) {
			x*=Math.pow(i, 2);
		}
		
		System.out.println("Произведение квадратов первых "+(i-1)+" чисел равна " + x);

	}

}
