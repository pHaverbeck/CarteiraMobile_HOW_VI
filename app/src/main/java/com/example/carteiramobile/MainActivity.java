package com.example.carteiramobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);     // Arquivo de layout -> mostra o conteúdo da activity

        View v = findViewById(R.id.buttonSomar);
        v.setOnClickListener(new View.OnClickListener() { // Criando objeto de classe anônima para evento de click
            @Override
            public void onClick(View view) {
                Log.i("botao", "O botão foi clicado");
            }
        });

    }
}