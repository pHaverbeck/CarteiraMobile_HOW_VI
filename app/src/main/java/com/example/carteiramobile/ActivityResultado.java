package com.example.carteiramobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ActivityResultado extends AppCompatActivity {
    private static ArrayList<Integer> historico = new ArrayList<Integer>();                         // Criação do espaço de lista de histórico de valores
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        int soma = this.getIntent().getIntExtra("calculo", -1);
        historico.add(soma);                                                                        // Valores de soma são guardados aqui no histórico
        ((TextView)findViewById(R.id.textViewResultadoSoma)).setText(String.valueOf(soma));
        LinearLayout ll = findViewById(R.id.llCalculo);                                             // Referencia o linear layout
        for(Integer valor: historico){                                                              // Pega o valor do histórico e coloca em um novo textview
            TextView tv = new TextView(this);
            tv.setText(String.valueOf(valor));
            ll.addView(tv);
        }
    }
}