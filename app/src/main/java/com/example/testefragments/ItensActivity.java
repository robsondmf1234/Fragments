package com.example.testefragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

public class ItensActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itens);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transacao = fragmentManager.beginTransaction();
        transacao.replace(R.id.frame_secundario,new ItensFragment());
        transacao.commit();
    }
}
