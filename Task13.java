package by.epam.jonline.module01;

/* Модуль 1. Ветвления. Задача 3
Даны три точки. Определить, будут ли они расположены на одной прямой 
*/

public class Task13 {

	public static void main(String[] args) {
		int x1;
		int x2;
		int x3;
		int y1;
		int y2;
		int y3;
				
		x1=(int)(Math.random()*10);
		x2=(int)(Math.random()*10);
		x3=(int)(Math.random()*10);
		y1=(int)(Math.random()*10);
		y2=(int)(Math.random()*10);
		y3=(int)(Math.random()*10);
		
		System.out.println("Определяет, находятся ли точки на одной прямой");
		System.out.println();
		System.out.println("Точка A с координатами " + x1 + ", " + y1);
		System.out.println("Точка B с координатами " + x2 + ", " + y2);
		System.out.println("Точка C с координатами " + x3 + ", " + y3);
		System.out.println();
		
		//if ((double)(x2-x1)/(double)(x3-x1)==(double)(y2-y1)/(double)(y3-y1)) {
		if((x1-x3)*(y2-y3)==(x2-x3)*(y1-y3)) {
			System.out.println("Точки лежат на одной прямой");
		}
		else {
			System.out.println("Точки не лежат на одной прямой");
		}

	}

}
