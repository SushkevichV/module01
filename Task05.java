package by.epam.jonline.module01;

import java.util.Scanner;

/*
Дано натуральное число, которое представляет длительность прошедшего времени в секундах.
Вывести данное значение длительности в часах, минутах и секундах в формате HHч MMмин SSс.
 */

public class Task05 {

	public static void main(String[] args) {
		int t;
		byte m;
		byte s;
		
		System.out.println("Программа переводит прошедшее время в секундах в формат HHч MMмин SSс");
		System.out.println("");
		
		t = console();
		
		s=(byte)(t%60);
		t/=60;
		m=(byte)(t%60);
		t/=60;
				
		if (t<10)
			System.out.print("Прошло 0"+t+"ч " );
		else 
			System.out.print("Прошло "+t+"ч " );
		
		if (m<10)
			System.out.print("0"+m+"мин " );
		else 
			System.out.print(m+"мин " );
		
		if (s<10)
			System.out.print("0"+s+"c" );
		else 
			System.out.print(s+"c " );

	}

	public static int console() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Введите прошедшее время в секундах >> ");		
		
		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.print("Введите прошедшее время в секундах >> ");
		}
		return scanner.nextInt();
		
	}
}
