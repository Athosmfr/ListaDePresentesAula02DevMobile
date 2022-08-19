package br.com.up.listadepresents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AddGIftActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_gift);
    }
}

// Android Application - Toda interação/gestão entre as activities tem de passar pela aplicação android.
// Para utilizar outra tela é necessário o uso do Intent.