package demo;

import java.util.Scanner;

public class Starpatten {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n= s.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
}
}
