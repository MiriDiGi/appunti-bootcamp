package esercizi;

import java.util.Scanner;

public class Fibonacci {
	public static void main (String[] args) {
		
		Scanner fibo = new Scanner(System.in);
		System.out.println("inserisci un numero");
		int maxnum = fibo.nextInt();
		int due = 0;
		int uno = due-1;
		int i = 0;
		
		while (i < maxnum) {
			int tre = uno + due;
			System.out.println(Math.abs(tre));
		    uno = due;
			due = tre;
		    i++;
		   
		}
		
		fibo.close();
	}
}
