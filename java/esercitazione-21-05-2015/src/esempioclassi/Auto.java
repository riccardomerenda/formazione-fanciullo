/*
 * La classe Auto
 */

package esempioclassi;

public class Auto {
	//Elenco attributi(proprietà) della classe Auto
	private String targa;
	private int cilindrata;
	private String modello;
	
	//Costruttori
	public Auto(String t, int c, String m){
		targa = t;
		cilindrata = c;
		modello = m;
	}
	
	//Metodi per accedere o modificare gli attributi
	public String getTarga(){
		return targa;
	}
	
	public int getCilindrata(){
		return cilindrata;
	}
	
	public String getModello(){
		return modello;
	}
	
	public void setTarga(String nuovaTarga){
		targa = nuovaTarga;
	}
	
	public void setCilindrata(int nuovaCilindrata){
		cilindrata = nuovaCilindrata;
	}
	
	public void setModello(String nuovoModello){
		modello = nuovoModello;
	}
	
	@Override
	public String toString(){
		String str;
		str = "Targa: " + targa + " Cilindrata: " + cilindrata + " Modello: " + modello;
		return str;
	}
}