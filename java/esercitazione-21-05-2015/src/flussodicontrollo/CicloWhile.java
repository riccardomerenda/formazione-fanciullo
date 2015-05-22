package flussodicontrollo;

import java.util.Scanner;

public class CicloWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String response = "start";
		
		do{
			System.out.println("Programma in fase di " + response);
			System.out.print("Inserisci comando: ");
			response = scanner.nextLine();
		}
		while(!response.equals("stop"));
		
		System.out.println("Chiusura del programma");
	}

}
