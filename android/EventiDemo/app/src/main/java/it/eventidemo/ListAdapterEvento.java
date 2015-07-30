package it.eventidemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * La classe ArrayAdapter e' in grado di gestire una lista o un array di oggetti Java come input.
 * Ad ogni oggetto Java corrisponde una riga.
 *
 * L'ArrayAdapeter e' limitato, nel caso in cui si vuole supportare diverse viste e' necessario
 * creare una implentazione personalizzata dell'adapter.
 *
 * L'adapter deve creare il layout per ciascuna riga della lista. ListView chiama il metodo getView().
 * In questo metodo l'adattatore crea il layout per ogni riga della lista
 * e associa i dati alle viste nel layout.
 */
public class ListAdapterEvento extends ArrayAdapter<Evento> {

    private Context activity;
    private ArrayList<Evento> data;

    /**
     * Una classe ViewHolder e' tipicamente una classe statica presente nel nostro adapter
     * che contiene riferimenti alle viste piu' di rilievo.
     */
    static class ViewHolder {
        public TextView id;
        public TextView titolo;
        public TextView categoria;
        public TextView giorno;
        public TextView mese;
        public TextView luogo;
    }

    public ListAdapterEvento(Context a, ArrayList<Evento> d) {
        super(a, R.layout.list_item_event, d);
        activity = a;
        data = d;
    }

    /**
     * All'interno del metodo getView() si dovrebbe raffigurare un layout basato su XML
     * e quindi impostare il contenuto delle pagine viste in base all'oggetto Java.
     * Per raffigurare il file di layout XML, è possibile utilizzare il servizio di sistema LayoutInflater.
     *
     * @param position
     * @param convertView
     * @param parent
     * @return vi a View
     */

    public View getView(int position, View convertView, ViewGroup parent) {
        View vi = convertView;
        if(vi == null) {

            LayoutInflater inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            vi = inflater.inflate(R.layout.list_item_event, null);

            /**
             * Per migliorare le performance della nostra list facciamo uso del "view holder" pattern.
             * Popoliamo il nostro viewHolder e conserviamo esso all'interno del layout.
             */
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.id = (TextView) vi.findViewById(R.id.id_evento);
            viewHolder.titolo = (TextView) vi.findViewById(R.id.titolo_evento);
            viewHolder.categoria = (TextView) vi.findViewById(R.id.categoria_evento);
            viewHolder.giorno = (TextView) vi.findViewById(R.id.giorno);
            viewHolder.mese = (TextView) vi.findViewById(R.id.mese);
            viewHolder.luogo = (TextView) vi.findViewById(R.id.luogo_evento);
            vi.setTag(viewHolder);
        }

        ViewHolder holder = (ViewHolder) vi.getTag();
        final Evento evento = data.get(position);

        holder.id.setText(evento.getId());
        holder.titolo.setText(evento.getTitolo());
        holder.categoria.setText(evento.getCategoria());
        holder.giorno.setText(evento.getGiorno());
        holder.mese.setText(evento.getMese());
        holder.luogo.setText(evento.getLuogo());

        return vi;

    }
}
