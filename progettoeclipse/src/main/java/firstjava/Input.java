package firstjava;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.println(input.nextInt());  //stampiamo l'input che è un integer, se l'input è una stringa o un float darà errore
//		System.out.println(input.nextLine()); //in questo modo ci printerà la stringa intera, se avessimo scritto solo input.next() avrebbe preso solo il primo elemento della frase.
	
		
		Scanner inputint = new Scanner(System.in);
		
		System.out.println("please enter the day of your birthday:");
		
		int rollno = inputint.nextInt();   //proviamo ad usare la classe scanner per gli integer
		System.out.println("You are born on the " + rollno);

		Scanner inputstring = new Scanner (System.in);
		
		System.out.println("Waht's your name?");
		String name = inputstring.next(); //prendiamo l'input dalla stringa
		System.out.println("Your name is " + name);
		
		Scanner inputallstring = new Scanner(System.in);
		
		System.out.println("Describe yourself:");
		String describe = inputallstring.nextLine(); //prendiamo in input tutta una frase
		System.out.println("You see yourself as: " + describe);
		
		Scanner inputfloat = new Scanner(System.in);
		
		System.out.println("tell me exactly, how tall are u?");
		
		float tall = inputfloat.nextFloat(); //input di un float
		System.out.println("So, you are " + tall);
		
//		input.close(); //questa riga serve a chiudere lo scanner, in caso contrario da warning
		inputint.close();
		inputstring.close();
		inputallstring.close();
		inputfloat.close();
	}
	
}
