package it.eventidemo;

import java.io.Serializable;

/**
 * Questa è la mia classe Evento
 *
 * Ogni evento è caratterizzato da un titolo, una categoria, il giorno e il mese e il luogo
 */

public class Evento implements Serializable {

    //attributi della classe Evento
    private String id;
    private String titolo;
    private String categoria;
    private String giorno;
    private String mese;
    private String luogo;

    //metodo costruttore
    public Evento(String id, String titolo, String categoria, String giorno, String mese, String luogo) {
        this.id = id;
        this.titolo = titolo;
        this.categoria = categoria;
        this.giorno = giorno;
        this.mese = mese;
        this.luogo = luogo;
    }

    //metodi accessori get e set
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getGiorno() {
        return giorno;
    }

    public void setGiorno(String giorno) {
        this.giorno = giorno;
    }

    public String getMese() {
        return mese;
    }

    public void setMese(String mese) {
        this.mese = mese;
    }

    public String getLuogo() {
        return luogo;
    }

    public void setLuogo(String luogo) {
        this.luogo = luogo;
    }
}
