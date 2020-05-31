package com.example.testefragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.testefragments.modelo.Prova;

import java.util.Arrays;
import java.util.List;

public class ProvasFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_activity_provas,container,false);

        ListView lista = view.findViewById(R.id.prova_lista);

        List<String> topicosPortugues = Arrays.asList("Redação", "Pontuação", "Gramatica");
        Prova provaPortugues = new Prova("Portugues", "30/05/2020", topicosPortugues);

        List<String> topicosMatematica = Arrays.asList("Geometria", "Divisao");
        Prova provaMatematica = new Prova("Matematica", "01/06/2020", topicosMatematica);

        List<Prova> provas = Arrays.asList(provaMatematica, provaPortugues);
        ArrayAdapter<Prova> adapter = new ArrayAdapter<Prova>(getContext(), android.R.layout.simple_list_item_1, provas);
        lista.setAdapter(adapter);

        return view;
    }
}
