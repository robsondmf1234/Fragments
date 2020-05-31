package com.example.testefragments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botao = findViewById(R.id.btn_lista);
        Button botaoItem = findViewById(R.id.btn_lista_itens);
        Button botaoFragments = findViewById(R.id.btn_tela_fragments_dividos);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vaiPraLista = new Intent(MainActivity.this, ProvasActivity.class);
                startActivity(vaiPraLista);
            }
        });

        botaoItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vaiProItens = new Intent(MainActivity.this, ItensActivity.class);
                startActivity(vaiProItens);
            }
        });

        botaoFragments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vaiProFragments = new Intent(MainActivity.this, TelaComFragments.class);
                startActivity(vaiProFragments);
            }
        });
    }
}
