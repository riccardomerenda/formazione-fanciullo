package esempioclassi;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		int cilindrata;
		String targa, modello;
		
		Auto autoAlfio = new Auto("AX109HJ",1200,"Opel");
		Auto autoRosaria = new Auto("ZX109HJ",2000,"Fiat");
		
		System.out.println("Macchina di Alfio: " + autoAlfio);
		
		System.out.println("Cilindrata: " + autoRosaria.getCilindrata());
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Inserisci la nuova cilindrata: ");
		cilindrata = scanner.nextInt();
		System.out.print("Inserisci la nuova targa: ");
		targa = scanner.next();
		System.out.print("Inserisci il nuovo modello: ");
		modello = scanner.next();
		
		autoRosaria.setCilindrata(cilindrata);
		autoRosaria.setTarga(targa);
		autoRosaria.setModello(modello);
		
		System.out.println("Macchina di Rosaria: " + autoRosaria);

	}

}
