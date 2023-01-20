package esercizi;

import java.util.Scanner;

public class firstjava {

	public static void main(String[] args) {
		
	//fai la somma di due numeri dati dall'utente
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("inserisci due numeri per fare la somma.");
	System.out.println("primo numero:");
	int num1 = input.nextInt();
	
	System.out.println("secondo numero:");
	int num2 = input.nextInt();
	
	int sum = num1 + num2;
	System.out.println("la somma dei due numeri è: " + sum);
	
	input.close();
	
	//1 Write a program to print whether a number is even or odd, also take input from the user.
	
		
		
	}

}
