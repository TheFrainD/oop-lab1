package com.oop.lab1;

import java.util.Scanner;

/*
 * OOP Lab1
 * 
 * @author: Dmytro Zykov
 * 
 * Номер заліковки: 508
 * С1 = 0 --> '+'
 * C3 = 1
 * C5 = 3 --> '+'
 * C7 = 4 --> 'char'
 */

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double total = 0;
		final int c = 1;
		
		System.out.print("Enter A: ");
		int a = scanner.nextInt();
		
		System.out.print("Enter B: ");
		int b = scanner.nextInt();
		
		System.out.print("Enter N: ");
		int n = scanner.nextInt();
		
		System.out.print("Enter M: ");
		int m = scanner.nextInt();
		
		for (char i = (char) a; i <= n; i++) {
			for (char j = (char) b; j <= m; j++) {
				if ((i + c) == 0) {
					System.out.println("Division by zero!");
					continue;
				}
				
				total += (i + j) / (i + c);
			}
		}
		
		System.out.printf("Result: %.2f", total);
	}

}
