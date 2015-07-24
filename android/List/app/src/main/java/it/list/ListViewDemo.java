package it.list;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Uno dei controlli grafici fondamentale e più utilizzato nella piattaforma Android è certamente la ListView.
 * Essa viene utilizzata per rappresentare liste, elenchi attraverso un adapter che viene implementato all'interno di essa.
 * L'adapter di cui stiamo parlando è un componente che si occupa della rappresentazione grafica dei dati
 * e dell'interazione con essi, per ogni elemento della ListView.
 *
 * L'ArrayAdapter è un'implementazione dell'interfaccia ListAdapter che viene utilizzata
 * per visualizzare un array di elementi dove ad ogni elemento della lista è associata una TextView.
 * Nella TextView viene visualizzato il toString() dell'elemento.
 */


public class ListViewDemo extends Activity {

    private ListView listView;
    private ArrayAdapter<String> adapter;
    private String regioni[] = {"Valle d'Aosta", "Piemonte",
            "Lombardia", "Trentino Alto Adige", "Friuli Venezia Giulia",
            "Veneto", "Emilia Romagna", "Liguria",
            "Toscana", "Umbria", "Marche", "Lazio",
            "Abruzzo", "Campania", "Molise",
            "Puglia", "Basilicata", "Calabria", "Sicilia", "Sardegna"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = (ListView) findViewById(R.id.listView);

        /**
         * Esistono all'interno della piattaforma android delle risorse già predefinite da
         * utilizzare all'interno dell'adapter senza implementare nessuna risorsa XML.
         * Queste risorse sono implementate già all'interno della classe android.R.
         * Abbiamo due layout predefiniti che sono
         * android.R.layout.simple_list_item_1 e android.R.layout.simple_list_item_2.
         */
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, regioni);

        /**
         * click vs selection
         * nel caso in cui si rende necessario selezionare piu' elementi della lista posso scegliere
         * un altro layout ed aggiungere android:choiceMode="multipleChoice" nel mio file xml.
         */
        //adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice, regioni);
        listView.setAdapter(adapter);

        /**
         * Per listeners intendiamo la possibilità di catturare gli eventi che vengono generati quando facciamo click
         * o selezioniamo un qualsiasi elemento della lista.
         * Ciò ci permette di associare all'evento un'azione che implementiamo all'interno di un'interfaccia specifica.
         */
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, final View view, int position, long id) {
                Toast.makeText(getApplicationContext(), regioni[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
