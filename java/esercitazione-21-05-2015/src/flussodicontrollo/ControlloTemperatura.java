/*
 * Esempio flusso di controllo if-else
 */
package flussodicontrollo;

import java.util.Random;
import java.util.Scanner;

/**
 * @author ricky
 * Perchè il metodo calcoloRandom ha bisogno di essere dichiarato static?
 */
public class ControlloTemperatura {
	
	public static void main(String[] args){
		//Definisco ed inizializzo la variabile temperatura
		int temperatura = 0;
		
		//Definisco le soglie del valore random
		//int minimo,massimo;
		
		//Acquisisco il valore
		/*Scanner scanner = new Scanner(System.in);
		System.out.print("Inserisci il valore minimo: ");
		minimo = scanner.nextInt();
		System.out.print("Inserisci il valore massimo: ");
		massimo = scanner.nextInt();
		scanner.close();*/
		
		for(int i = 0; i<10; i++){
			//Assegno un valore random compreso tra 5 e 15
			temperatura = new Random().nextInt(11) + 5;
			//temperatura = calcoloRandom(5,15);
			//temperatura = calcoloRandom(minimo,massimo);
			if(temperatura > 10){
				//Fare qualcosa: abbassare la temperatura?
				System.out.println("Temperatura critica: " + temperatura);
				}
			else{
				System.out.println("Temperatura stazionaria: " + temperatura);
				}
		}
	}
	
	public static int calcoloRandom(int min, int max){
		Random random = new Random();
		
		int numeroRandom = random.nextInt(max - min + 1) + min;
		
		return numeroRandom;
	}
}
