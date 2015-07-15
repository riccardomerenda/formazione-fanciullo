package it.linearandrelativelayout;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

/**
 * questo esempio mostra la differenza tra il linear layout e
 * il relative layout.
 *
 * Il LinearLayout è una view che allinea tutti i figli in una singola
 * direzione, verticale o orizzontale. La direzione si specifica tramite android:orientation.
 * Una caratteristica importante di questo layout e' che supporta l'attributo peso.
 * Il peso indica quanto spazio quella view deve occupare sullo schermo.
 *
 * Il RelativeLayout è una view che posiziona tutti i figli della view in posizione relativa.
 * La posizione di ciascuna view pue' essere specificata come relativa ad un elemento della view
 * (come ad esempio a sinistra di un elemento o sotto) oppure in posizione relativa al RelativeLayout
 * (come ad esempio allineato al fondo, sinistra o centrale).
 *
 * Vengono introdotti anche i Toast. Un toast fornisce un semplice feedback su un'operazione all'interno
 * di un piccolo popup. Esso riempie solo lo spazio richiesto per mostrare il messaggio.
 * L'attivita' corrente rimane visibile e intereattiva.
 *
 */

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         * questo setta il layout di tipo linear layout
         */
        //setContentView(R.layout.activity_main);

        /**
         * decommentando la riga seguente il layout utilizzato sara'
         * quello di tipo relative layout
         */
        setContentView(R.layout.relative_layout);
    }

    /**
     * metodo clicca bottone che ci mostra un messaggio di avviso sul bottone premuto
     * @param v
     */
    public void clickBottone(View v) {

        switch (v.getId()) {
            case R.id.button1:
                Toast.makeText(getApplicationContext(), "Premuto Bottone 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(getApplicationContext(), "Premuto Bottone 2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Toast.makeText(getApplicationContext(), "Premuto Bottone 3", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonGreen:
                Toast toast = Toast.makeText(getApplicationContext(), "Premuto clicca qui", Toast.LENGTH_SHORT);
                //questo posiziona il toast in alto a sinistra
                toast.setGravity(Gravity.TOP|Gravity.LEFT, 50, 50);
                toast.show();
                break;
        }
    }
}
