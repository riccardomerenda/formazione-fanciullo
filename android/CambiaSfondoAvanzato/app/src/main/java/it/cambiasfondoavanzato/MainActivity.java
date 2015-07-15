    package it.cambiasfondoavanzato;

    import android.os.Bundle;
    import android.support.v7.app.AppCompatActivity;
    import android.util.Log;
    import android.view.View;
    import android.widget.RelativeLayout;

    /**
     * Questa applicazione e' una versione avanzata del cambia sfondo visto precedentemente.
     * Essa non fa altro che mostrare una serie di bottoni colorati dove al click dell'utente
     * viene cambiato il colore di sfondo.
     * Lo scopo è quello di accedere alle risorse dichiarate, come bottone, layout, ecc.. e ripassare
     * anche i costrutti di base di java.
     *
     */
    public class MainActivity extends AppCompatActivity {

        private final String TAG = "CambiaSfondoAvanzato";

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        public void cambiaSfondo(View v) {

            RelativeLayout layout = (RelativeLayout) findViewById(R.id.sfondoActvity);

            /**
             * controllo qual è l'id del bottone premuto dall'utente
             * e a seconda dei casi setto il colore di background del layout
             */
            switch(v.getId()) {
                case R.id.buttonGiallo:
                    layout.setBackgroundColor(getResources().getColor(R.color.Giallo));
                    break;
                case R.id.buttonRosso:
                    layout.setBackgroundColor(getResources().getColor(R.color.Rosso));
                    break;
                case R.id.buttonVerde:
                    layout.setBackgroundColor(getResources().getColor(R.color.Verde));
                    break;
                case R.id.buttonBlue:
                    layout.setBackgroundColor(getResources().getColor(R.color.Blue));
                    break;
                case R.id.buttonRosa:
                    layout.setBackgroundColor(getResources().getColor(R.color.Rosa));
                    break;
                case R.id.buttonArancio:
                    layout.setBackgroundColor(getResources().getColor(R.color.Arancio));
                    break;
            }
        }

        @Override
        protected void onStart(){
            super.onStart();
            Log.d(TAG, "Activity visibile e in procinto di essere avviata");
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
