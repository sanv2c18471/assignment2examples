package demo;

import java.util.Scanner;

public class Stringreverse {
public static void main(String[] args) {
	System.out.println("Enter the rev string:");
    Scanner s=new Scanner(System.in);
	String s1= s.nextLine();
	int len=s1.length();
	int i;
    for(i=len-1; i>=0; i--)
    {
		System.out.print(s1.charAt(i));
	}
}
}
