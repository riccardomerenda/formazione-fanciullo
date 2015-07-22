package it.grid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

/**
 * GridView mostra gli items in una griglia bi-dimensionale scrollabile.
 * Gli items sono automanticamente inseriti nel layout usando a ListAdapter.
 *
 * L'ArrayAdapter è un'implementazione dell'interfaccia ListAdapter che viene utilizzata
 * per visualizzare un'array di elementi dove ad ogni elemento della lista è associata una TextView.
 * Nella TextView viene visualizzato il toString() dell'elemento.
 */

public class GridViewDemo extends Activity {

    private TextView selection;
    private GridView gridView;
    private ArrayAdapter<String> adapter;
    private String regioni[] = {"albicocca", "ananas",
            "anguria", "arancia", "banana", "ciliegia", "fragola",
            "lampone", "limone", "loto", "mandarino",
            "mela", "melone", "pera", "pesca", "uva"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        gridView = (GridView) findViewById(R.id.grid);
        selection = (TextView) findViewById(R.id.selection);

        adapter = new ArrayAdapter<String>(this, R.layout.cell, regioni);
        gridView.setAdapter(adapter);

        /**
         * Per listeners intendiamo la possibilità di catturare gli eventi che vengono generati quando facciamo click
         * o selezioniamo un qualsiasi elemento della lista.
         * Ciò ci permette di associare all'evento un'azione che implementiamo all'interno di un'interfaccia specifica.
         */
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, final View view, int position, long id) {
                selection.setText(regioni[position]);
            }
        });

    }
}
