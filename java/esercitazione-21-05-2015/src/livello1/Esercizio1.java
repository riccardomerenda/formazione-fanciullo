package livello1;

import java.util.*;

//import java.util.Scanner;

public class Esercizio1 {

	public static void main(String[] args) {
		//Dichiaro le variabili intere
		int x;
		int a;
		int b;
		int y;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Inserire valore di x: ");
		x = scanner.nextInt();
		System.out.print("Inserire valore di a: ");
		a = scanner.nextInt();
		System.out.print("Inserire valore di b: ");
		b = scanner.nextInt();
		
		//Calcolo il valore di y
		y = x * a + b;
		
		//Stampa a video del risultato
		System.out.println("Valore di y: " + y);
	}

}
