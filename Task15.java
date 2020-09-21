package by.epam.jonline.module01;

/*
 * Вычислить значение функции
 */
public class Task15 {

	public static void main(String[] args) {
		double x;
		
		x=-10+(int)(Math.random()*20);
		
		System.out.println("Вычисление значения функции");
		System.out.println();
		System.out.println("x = " + x);
		
		if (x<=3)
			x=Math.pow(x, 2)-3*x+9;
		else
			x=1/(Math.pow(x, 3)+6);
		
		System.out.println("F(x) = " + x);

	}

}
