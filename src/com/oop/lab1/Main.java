package com.oop.lab1;

import java.util.Scanner;

/*
 * OOP Lab1
 * 
 * Номер заліковки: 508
 * С1 = 0 --> '+'
 * C3 = 1
 * C5 = 3 --> '+'
 * C7 = 4 --> 'char'
 * 
 * @author	Dmytro Zykov
 */

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double total = 0;
		final int c = 1;
		
		System.out.print("Enter A: ");
		char a = (char) scanner.nextInt();
		
		System.out.print("Enter B: ");
		char b = (char) scanner.nextInt();
		
		System.out.print("Enter N: ");
		char n = (char) scanner.nextInt();
		
		System.out.print("Enter M: ");
		char m = (char) scanner.nextInt();
		
		// Division by zero check, not needed if c is more then 1
		if ( (a + c) == 0 ) {
			System.out.println("Division by zero!");
			return;
		}
		
		for ( char i = (char) a; i <= n; i++ ) {
			for ( char j = (char) b; j <= m; j++ ) {
				total += ((double) (i + j)) / ((double) (i + c));
			}
		}
		
		System.out.printf("Result: %.2f", total);
	}

}
