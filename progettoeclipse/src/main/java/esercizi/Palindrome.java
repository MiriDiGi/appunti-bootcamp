package esercizi;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner word = new Scanner(System.in);
		System.out.println("inserisci parola");
		String pal = word.next();
		StringBuilder parolapal = new StringBuilder();
		
		for(int i = (pal.length() - 1); i >=0; --i) {
			parolapal = parolapal.append(pal.charAt(i));
			
		}	
	    String palindromo = parolapal.toString();
		if (palindromo.equals(pal)) {
			System.out.println(pal + " è palindromo");
		} else {
			System.out.println(pal + " non è palindromo");
		}
		
		word.close();

	}
}
