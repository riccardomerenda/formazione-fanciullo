package com.example.ciaomondoconlogin;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends Activity {

    private EditText uname;
    private EditText passwd;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        uname = (EditText) findViewById(R.id.username_edittext);
        passwd = (EditText) findViewById(R.id.password_edittext);
    }

    public void eseguiLogin(View v) {
        if (checkPassword(uname.getText(), passwd.getText())) {

            // Creiamo un intent esplicito per avviare MainActivity
            Intent helloAndroidIntent = new Intent(LoginActivity.this,
                    MainActivity.class);

            // Usiamo l'Intent per avviare la MainActivity
            startActivity(helloAndroidIntent);
        } else {
            uname.setText("");
            passwd.setText("");
        }
    }

    private boolean checkPassword(Editable uname, Editable passwd) {
        // Fingiamo di estrarre il testo e verificare le credenziali
        return new Random().nextBoolean();
    }
}
