package com.example.carteiramobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);     // Arquivo de layout -> mostra o conteúdo da activity

        View v = findViewById(R.id.buttonSomar);
        v.setOnClickListener(new View.OnClickListener() { // Criando objeto de classe anônima para evento de click
            @Override
            public void onClick(View view) {
                View v = findViewById(R.id.editTextA);
                EditText et = (EditText) v;
                String valorCampoA = et.getText().toString();
                String valorCampoB = ((EditText)findViewById(R.id.editTextB)).getText().toString();
                int valorA = Integer.parseInt(valorCampoA);
                int valorB = Integer.parseInt(valorCampoB);
                int soma = valorA + valorB;

                TextView tv = (TextView)findViewById(R.id.textViewSoma);
                String somaTexto = String.valueOf(soma);
                tv.setText(somaTexto);
                Log.i("botao", "O botão foi clicado:"+ valorCampoA);
            }
        });

    }
}