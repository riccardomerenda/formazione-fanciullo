package it.eventidemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Questa demo serve per mostrare come poter creare una lista di eventi personalizzata.
 *
 * Sappiamo che l'ArrayAdapter e' un'implementazione dell'interfaccia ListAdapter che viene utilizzata per
 * visualizzare un array di elementi dove ad ogni elemento della lista è associata una TextView.
 *
 * In questo esempio noi andremo a creare un ArrayAdapter personalizzato per poterlo adattare meglio
 * alle nostre esigenze.
 *
 * Questo Esempio e' simile a quelli visti in precenza (List, Grid).
 * Quello che risalta subito ad una prima lettura del coide e' che invece di utilizzare un
 * semplice ArrayAdapter utilizzeremo un ListAdapterEvento da noi creato.
 *
 */
public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ListAdapterEvento adapter;
    private ArrayList<Evento> listEvento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listEvento = new ArrayList<Evento>();

        /**
         * Creiamo 10 eventi sulla base del nostro oggetto Evento creato.
         *
         * Solitamente al posto di queste si accede in lettura al database dell'applicazione, oppure
         * si interroga un web server che ci ritorna una lista di tutti gli eventi.
         *
         * In questo esempio semplifichiamo il tutto e creiamo 10 eventi statici.
         */
        Evento evento1 = new Evento("1", "Delta Moon", "musica", "24", "luglio", "Mascalucia (CT)");
        Evento evento2 = new Evento("2", "Marracash", "musica", "25", "luglio", "Zafferana Etnea (CT)");
        Evento evento3 = new Evento("3", "Festa della Birra", "festival, fiere, musica, mercatini", "26", "luglio", "Valverde (CT)");
        Evento evento4 = new Evento("4", "CrossRoad", "arte, incontri", "27", "luglio", "Catania (CT)");
        Evento evento5 = new Evento("5", "Vivaci", "arte, danza, feste, musica", "29", "luglio", "Acireale (CT)");
        Evento evento6 = new Evento("6", "Fedez", "musica", "1", "agosto", "Villa Bellini, Catania (CT)");
        Evento evento7 = new Evento("7", "I mangianastri", "musica", "3", "agosto", "Centro storico, Acireale (CT)");
        Evento evento8 = new Evento("8", "Dirotta su cuba", "musica", "8", "agosto", "Qubba, Catania (CT)");
        Evento evento9 = new Evento("9", "Subsonica", "musica", "12", "agosto", "Villa Bellini, Catania (CT)");
        Evento evento10 = new Evento("10", "Catania Tango festival", "festival", "16", "agosto", "Anfiteatro Le ciminiere, Catania (CT)");

        /**
         * aggiungiamo i 10 eventi all'arrayList che in seguito passeremo al nostro Adapter
         */
        listEvento.add(evento1);
        listEvento.add(evento2);
        listEvento.add(evento3);
        listEvento.add(evento4);
        listEvento.add(evento5);
        listEvento.add(evento6);
        listEvento.add(evento7);
        listEvento.add(evento8);
        listEvento.add(evento9);
        listEvento.add(evento10);

        listView = (ListView) findViewById(R.id.listView);


        adapter = new ListAdapterEvento(this, listEvento);
        listView.setAdapter(adapter);

        /**
         * Aggiungiamo il listner alla nostra listView in modo da catturare gli eventi che vengono
         * generati quando facciamo click su un elemento della lista.
         *
         * Cio' ci permette di associare all'evento un'azione.
         */
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), listEvento.get(position).getTitolo(), Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
