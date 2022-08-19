package br.com.up.listadepresents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton fabAddGift; // declarando botao flutuante

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fabAddGift = findViewById(R.id.fab_add_gift);

        fabAddGift.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) { // ao clicar sera direcionado a nova pagina (activity)

                        Intent intent = new Intent(
                                getApplicationContext(), AddGIftActivity.class // Pega o contexto de toda aplicação e adiciona a classe da nova activity
                        );
                        startActivity(intent);

                    }
                });

    }
}