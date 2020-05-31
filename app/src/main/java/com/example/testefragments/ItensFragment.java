package com.example.testefragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.testefragments.modelo.Itens;

import java.util.Arrays;
import java.util.List;


public class ItensFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragments_activity_itens, container, false);

        ListView listaItens = view.findViewById(R.id.marcas_lista);
        List<String> marcasRobson = Arrays.asList("Portinari", "CocaCola", "Deca");
        Itens itens1 = new Itens("Robson", "01/06/2020", marcasRobson);

        List<String> marcasDouglas = Arrays.asList("Google", "Drogasil", "Nestle");
        Itens itens2 = new Itens("Douglas", "02/06/2020", marcasDouglas);

        List<Itens> itens = Arrays.asList(itens1, itens2);
        ArrayAdapter<Itens> adapter = new ArrayAdapter<Itens>(getContext(), android.R.layout.simple_list_item_1, itens);
        listaItens.setAdapter(adapter);

        return view;
    }
}
