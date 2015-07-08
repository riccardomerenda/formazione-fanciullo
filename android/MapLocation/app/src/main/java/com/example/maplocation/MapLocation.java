package com.example.maplocation;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MapLocation extends Activity {

    private final String TAG = "MapLocation";
    private EditText indirizzoEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Chiamata richiesta
        super.onCreate(savedInstanceState);

        //Imposta il content view
        setContentView(R.layout.activity_map_location);

        //Inizializziamo gli elementi grafici
        indirizzoEdit = (EditText) findViewById(R.id.location);
    }

    public void mostraMappa(View view){
        try{
            //Processiamo il testo per la trasmissione di rete
            String indirizzo = indirizzoEdit.getText().toString();
            indirizzo = indirizzo.replace(' ', '+');

            //Creiamo l'oggetto Intent per aprire l'applicazione Google Map
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=" + indirizzo));

            //Usiamo l'intent per avviare l'applicazione
            startActivity(mapIntent);
        }catch (Exception e){
            //Scriviamo eventuali errori sul LogCat
            Log.d(TAG,e.toString());
        }
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG,"Activity visibile e in procinto di essere avviata");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG,"Activity è visibile e in procinto di essere riavviata");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG, "Activity <<riesumata>>");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG, "Un'altra Activity ha il focus");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG,"Activity non più visibile");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "Activity viene cancellata");
    }
}
