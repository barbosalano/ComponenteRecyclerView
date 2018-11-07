package com.example.barbosa.recyclerview.activity.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.example.barbosa.recyclerview.R;
import com.example.barbosa.recyclerview.activity.adapter.Adapter;
import com.example.barbosa.recyclerview.activity.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> listaFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //Listagem de filmes

        this.criarFilmes();

        //Configurar adapter

        Adapter adapter = new Adapter(listaFilmes);


        //configurar RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));

        recyclerView.setAdapter(adapter);
    }

    public void criarFilmes(){

        Filme filme = new Filme("Mulher Maravilha", "Ação", "2016");
        listaFilmes.add(filme);

        filme = new Filme ("Homem Aranha", "Desenho", "2011");
        listaFilmes.add(filme);

        filme = new Filme ("Homem de Ferro", "Animação", "2012");
        listaFilmes.add(filme);

        filme = new Filme ("Tarzan", "Aventura", "1990");
        listaFilmes.add(filme);

        filme = new Filme ("Batman", "Desenho", "2014");
        listaFilmes.add(filme);

        filme = new Filme ("Homem Formiga", "Ação", "2015");
        listaFilmes.add(filme);

        filme = new Filme ("Super Homem", "Desenho", "2011");
        listaFilmes.add(filme);

        filme = new Filme ("A bela e a fera", "Romance", "2000");
        listaFilmes.add(filme);

        filme = new Filme ("Carros 2", "Desenho", "2014");
        listaFilmes.add(filme);

        filme = new Filme ("Carros 1", "Desenho", "2015");
        listaFilmes.add(filme);
        filme = new Filme ("A Múmia", "Terror", "2011");
        listaFilmes.add(filme);



    }
}
