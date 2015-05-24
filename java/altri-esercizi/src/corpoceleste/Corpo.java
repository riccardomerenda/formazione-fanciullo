/**
 * Esempio di una classe chiamata Pianeta, utilizzabile per 
 * memorizzare i dati che riguardano vari corpi celesti come
 * le comete, gli asteroidi, i pianeti e le stelle.
 */
package corpoceleste;

/**
 * @author ricky
 */
public class Corpo {
	private long idNum;
	private String nome;
	private Corpo orbita;
	
	private static long prossimoID = 0;
	
	// 3 Costruttori diversi
	public Corpo(){
		idNum = prossimoID++;
	}
	
	public Corpo(String nomeCorpo, Corpo orbitaIntorno){
		this();
		nome = nomeCorpo;
		orbita = orbitaIntorno;
	}
	
	public Corpo(String nomeCorpo){
		this(nomeCorpo, null);
	}
	
	// Metodi getter e setter
	public long getID(){
		return idNum;
	}
	
	public String getNome(){
		return nome;
	}
	
	public Corpo getOrbita(){
		return orbita;
	}
	
	public void setName(String nuovoNome){
		nome = nuovoNome;
	}
	
	public void setOrbita(Corpo orbitaIntorno){
		orbita = orbitaIntorno;
	}
	
	/*
	 * Il seguente metodo viene applicato quando un corpo celeste
	 * viene catturato da un altro corpo e spinto ad orbitare
	 * intorno ad esso.
	 */
	public void cattura(Corpo vittima){
		vittima.orbita = this; //ve l'aspettavate?
	}
	
	@Override
	public String toString(){
		String stringa;
		stringa = "ID: " + idNum;
		stringa += " Nome: " + nome;
		stringa += " Orbita: " + orbita;
		return stringa;
	}
}
