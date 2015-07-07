package it.cambiasfondo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

/**
 * Questa applicazione non fa altro che mostrare un bottone dove al click dell'utente
 * viene cambiato il colore di sfondo.
 * Lo scopo è quello di accedere alle risorse dichiarate, come bottone, layout, ecc..
 *
 * esercizio: cambiare anche il colore di sfondo del bottone
 */
public class MainActivity extends AppCompatActivity {

    /*
     * abbiamo bisogno di mantenere lo stato dello sfondo, per poterlo cambiare
     * per questo facciamo uso di una variabile
     */
    public boolean status = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setto l'aspetto che voglio dare alla mia activity richiamando il mio file di layout
        setContentView(R.layout.activity_main);
    }

    /*
     * metodo cambia sfondo, il metodo deve essere public e deve accettare
     * la View come solo parametro
     */
    public void cambiaSfondo(View v) {
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.sfondoActvity);
        Button bottoneSfondo = (Button) findViewById(R.id.bottoneSfondo);
        if(status) {
            layout.setBackgroundColor(getResources().getColor(R.color.Blue));
            bottoneSfondo.setBackgroundColor(getResources().getColor(R.color.Yellow));
            status = false;
        }
        else {
            layout.setBackgroundColor(getResources().getColor(R.color.Yellow));
            bottoneSfondo.setBackgroundColor(getResources().getColor(R.color.Blue));
            status = true;
        }
    }
}