package by.epam.jonline.module01;

/*
 * Даны два числа. Определить цифры, входящие в запись как первого, так и второго числа
 */
public class Task28 {

	public static void main(String[] args) {
		int a;
		int b;
		int i;
		int j;
		int t;
		
		a=-100000+(int)(Math.random()*200000);
		b=-100000+(int)(Math.random()*200000);

		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		System.out.println();
		System.out.print("Цифры, входящие в состав числа a и числа b : ");
		
		a=Math.abs(a);
		b=Math.abs(b);
		
		while (a>0) {
			i=a%10;
			t=b;
			while (t>0) {
				j=t%10;
				if (i==j)
					System.out.print(i +" ");
				t/=10;
			}
			a/=10;
		}
		
	}

}
