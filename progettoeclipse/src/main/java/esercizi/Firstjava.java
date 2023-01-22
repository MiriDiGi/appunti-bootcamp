package esercizi;

import java.util.Scanner;

public class Firstjava {

	public static void main(String[] args) {
		
	//fai la somma di due numeri dati dall'utente
		
//	Scanner input = new Scanner(System.in);
//	
//	System.out.println("inserisci due numeri per fare la somma.");
//	System.out.println("primo numero:");
//	int num1 = input.nextInt();
//	
//	System.out.println("secondo numero:");
//	int num2 = input.nextInt();
//	
//	int sum = num1 + num2;
//	System.out.println("la somma dei due numeri è: " + sum);
//	
//	input.close();
	
	//1 Write a program to print whether a number is even or odd, also take input from the user.
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("inser a number");
	int i = input.nextInt();
	if (i % 2 != 0) {
		System.out.println(i + " is odd");
	} else {
		System.out.println(i + " is even");
	}

	
	// 2 Take name as input and print a greeting message for that particular name.

	Scanner inputstring = new Scanner(System.in);
	System.out.println("Come ti chiami?");
	String name = inputstring.nextLine();
	
	System.out.println("Piacere di conoscerti, " + name);
	
	//3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
	
	Scanner ptr = new Scanner(System.in);
	System.out.println("please insert a principal:");
	int p = ptr.nextInt();
	System.out.println("please insert the time");
	int t = ptr.nextInt();
	System.out.println("please insert the rate");
	int r = ptr.nextInt();
	System.out.println("principal is " + p + ", time is: " + t + ", rate is " + r);
	float si = (p * r * t)/100;
	System.out.println("your interest is: " + si);
	
	//4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
	
	Scanner calculator = new Scanner(System.in);
	System.out.println("inserisci il primo numero: ");
	int num1 = calculator.nextInt();
	System.out.println("inserisci il secondo numero: ");
	int num2 = calculator.nextInt();

	System.out.println("scegli un'opzione: +, -, *, /");
	String op = calculator.next();
	
	if(op.equals("*")) {
		System.out.println(num1 * num2);
	}
	else if (op.equals("+")) {
		System.out.println(num1 + num2);
	}
	else if(op.equals("-")) {
		System.out.println(num1 - num2);
	}
	else if(op.equals("/")) {
		System.out.println(num1 / num2);
	}
	
	//5. Take 2 numbers as input and print the largest number.
	
	Scanner greater = new Scanner(System.in);
	System.out.println("insert first number:");
	int big1 = greater.nextInt();
	System.out.println("insert second number:");
	int big2 = greater.nextInt();
	
	if (big1 < big2) {
		System.out.println(big2 + " is bigger");
	} 
	else if (big1 == big2) {
		System.out.println("sono uguali");
	}else {
		System.out.println(big1 + " is bigger");
	}
	
	//6. Input currency in euro and output in USD.
	
	Scanner euro = new Scanner(System.in);
	System.out.println("inserisci la somma di denaro in euro per convertirla in dollari: ");
	int dol = euro.nextInt();
	System.out.println("inserisci il tasso di cambio odierno: ");
	float tasso = euro.nextFloat();
	System.out.println(dol * tasso);
	
	//7. To calculate Fibonacci Series up to n numbers.
	
	Scanner fibo = new Scanner(System.in);
	System.out.println("inserisci un numero");
	int maxnum = fibo.nextInt();
	int due = 0;
	int uno = due-1;
	int i1 = 0;
	
	while (i1 < maxnum) {
		int tre = uno + due;
		System.out.println(Math.abs(tre));
	    uno = due;
		due = tre;
	    i1++;
	   
	}
	
	//8. To find out whether the given String is Palindrome or not.
	
	Scanner word = new Scanner(System.in);
	System.out.println("inserisci parola");
	String pal = word.next();
	StringBuilder parolapal = new StringBuilder();
	
	for(int i2 = (pal.length() - 1); i2 >=0; --i2) {
		parolapal = parolapal.append(pal.charAt(i2));
		
	}	
    String palindromo = parolapal.toString();
	if (palindromo.equals(pal)) {
		System.out.println(pal + " è palindromo");
	} else {
		System.out.println(pal + " non è palindromo");
	}
	
	
	//9. To find Armstrong Number between two given number.
	
	Scanner amstrong = new Scanner(System.in);
	System.out.println("inserisci numero da verificare");
	int numero = amstrong.nextInt();
	System.out.println("inserisci di quante cifre è il numero per poterlo elevare");
	int potenza = amstrong.nextInt();
	int temp = numero;
	int a = 0;
	int x = 0;
	
	while ( numero > 0) {
		
		a = numero %10;
		numero = numero/10;
		x = x + (int) Math.pow(a, potenza);
		
	}
	
	if (x == temp) {
		System.out.println("amstrong");
	} else {
		System.out.println("non è");
	}
	
	word.close();
	amstrong.close();
	fibo.close();
	euro.close();
	greater.close();
	calculator.close();
	input.close();
	inputstring.close();
	ptr.close();
	}

}
