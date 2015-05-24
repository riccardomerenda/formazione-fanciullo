/**
 * MainClass per verificare le funzionalità
 * della classe Corpo
 */
package corpoceleste;

/**
 * @author ricky
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Creiamo alcuni oggetti utilizzando i 3 costruttori
		 * messi a disposizione dalla classe Corpo
		 */
		Corpo sole = new Corpo("Sole");
		Corpo terra = new Corpo("Terra", sole);
		Corpo luna = new Corpo("Luna", terra);
		Corpo asteroide = new Corpo();
		
		//Visualizziamo i contenuti
		System.out.println("CREAZIONE CORPI CELESTI IN CORSO......");
		System.out.println(sole);
		System.out.println(terra);
		System.out.println(luna);
		System.out.println(asteroide);
		
		//Impostiamo il nome all'oggetto asteroide
		asteroide.setName("Fanciullo");
		System.out.println("L'ASTEROIDE HA ADESSO UN NOME......");
		System.out.println(asteroide);
		
		System.out.println("ASTEROIDE CATTURATO DAL SOLE......");
		//L'oggetto asteroide è stato catturato dal sole!
		sole.cattura(asteroide);
		
		System.out.println(asteroide);
	}

}
