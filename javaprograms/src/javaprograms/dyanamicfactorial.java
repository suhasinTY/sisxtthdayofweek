package javaprograms;

import java.util.Scanner;

public class dyanamicfactorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		int s=sc.nextInt();
		int fact=1;
		for(int i=1;i<=s;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
