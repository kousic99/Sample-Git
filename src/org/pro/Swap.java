package org.pro;

public class Swap {
	public static void main(String[] args) {
		int a =10;
		int b =20;
		int c=0;
		c=a+b;
		a=c-a;
		b=c-a;
		System.out.println("Before swap a = 10");
		System.out.println("After swap a = "+a);
		System.out.println("Before swap b = 20");
		System.out.println("After swap b = "+b);
	}

}
