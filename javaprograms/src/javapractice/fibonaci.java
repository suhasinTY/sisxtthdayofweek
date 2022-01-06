package javapractice;

import java.util.Scanner;

public class fibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
				System.out.println("enter");
		int s=sc.nextInt();
		int fib1=0; int fib2=1; int fib3=0;
		System.out.println(fib1+" "+fib2);
		for(int i=0;i<=s;i++)
		{
			fib3=fib1+fib2;
			fib1=fib2;
			fib2=fib3;
			System.out.println(fib3);
		}
	}

}
