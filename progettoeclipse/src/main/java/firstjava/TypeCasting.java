package firstjava;

import java.util.Scanner;

public class TypeCasting {
	public static void main(String[] argse) {
		Scanner input = new Scanner(System.in);
		System.out.println("insert int number to see widening in action");
		float num = input.nextFloat();  //se qui al posto di un float metto un int java me lo casta automaticamente in un float
		System.out.println(num);
		
		
		int numero = (int)(67.56f);  //narrowing, metto il float dentro l'int
		System.out.println("narrowing in action " + numero);
		input.close();
		
		//automatic type promotion in expression
		
		int a = 257;
		byte b = (byte)(a);
		System.out.println(b); //questo da risultato 1 perchè il massimo di numeri che può contenere byte è 256!!!
		// il risultato è queindi la differenza tra l'int che abbiamo scritto e il massimo che può contenere byte: 257-256 = 1
	
		
		byte c = 40;
		byte d = 50;
		byte e = 100;
		int f = (c * d) / e;  //c, d, e sono byte. c * d fa 2000 e non dovrebbe starci in un byte ma java fa una promozione automatica in int quindi c * d non sono più byte in questa espressione ma int!!!
		System.out.println("automatic promotion " + f);
		
		int number = 'A'; //java segue lo standard unicode, in unicode la A corrisponde al numero 65, java stamberà 65
		System.out.println("unicode standard " + number);
		
		//esempio risolutivo di tutto, vediamo cosa esce se faccio operazioni tra tutti tipi diversi
		
		byte g = 42;
		char h = 'a';
		short s = 1024;
		int i = 50000;
		float l = 5.67f;
		double u = 0.1234;
		double result = (l * g) + (i / h) - (u * s);
		// risultato delle mini operazioni: float + int - double = double tutto convertito nel più grande
		System.out.println((l * g) + " " + (i / h) + " " + (u * s));
		System.out.println(result);
	}
}
