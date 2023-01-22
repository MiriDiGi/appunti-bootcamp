package esercizi;

import java.util.Scanner;

public class Amstrong {
	public static void main(String[] args) {
		
		Scanner amstrong = new Scanner(System.in);
		System.out.println("inserisci");
		int numero = amstrong.nextInt();
		int temp = numero;
		int a = 0;
		int x = 0;
		
		while (numero > 0) {
			
			a = numero %10;
			numero = numero/10;
			x = x + (int) Math.pow(a, 3);
			
		}
		
		if (x == temp) {
			System.out.println("amstrong");
		} else {
			System.out.println("non è");
		}
		
     amstrong.close();
	}
}	