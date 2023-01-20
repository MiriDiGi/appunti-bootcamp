package firstjava;

public class Loop {
	public static void main (String[] args) {
		int a = 10;
		if (a == 10) {
			System.out.println("Hello World!");
		}
		
		
		//usare il while quando non si sa per quanto tempo si deve looppare
		int count = 0;
		while (count != 5) { //finchè il count non è 5 stampa count
			System.out.println(count);
			count ++;  //aggiorna count
		}
		
		//usa il for loop quando si sa per quanto tempo si deve looppare
		int conto = 0;
		for (int i = 0; i != 5; i++) {
			System.out.println(conto);
			conto ++;
		}
		
		//posso scrivere
		//for(int count = 1; count != 5; count++)
	}
}
