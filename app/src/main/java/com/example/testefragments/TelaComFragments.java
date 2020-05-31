package com.example.testefragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class TelaComFragments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_com_fragments);


        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transacao = fragmentManager.beginTransaction();
        transacao.replace(R.id.fragment_esquerda,new ProvasFragment());
        transacao.replace(R.id.fragment_direita,new ItensFragment());
        transacao.commit();


    }
}
