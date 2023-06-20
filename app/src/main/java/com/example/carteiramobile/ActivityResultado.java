package com.example.carteiramobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityResultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        int soma = this.getIntent().getIntExtra("calculo", -1);
        ((TextView)findViewById(R.id.textViewResultadoSoma)).setText(String.valueOf(soma));
    }
}