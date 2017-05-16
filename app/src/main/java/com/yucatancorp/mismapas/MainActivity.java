package com.yucatancorp.mismapas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Lugar> lugares = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(llm);
        inicializarLugares();
        inicializarAdaptador();
    }

    public void inicializarAdaptador()
    {
        LugarAdaptador adaptador = new LugarAdaptador(lugares, this);
        recyclerView.setAdapter(adaptador);
    }


    public void inicializarLugares()
    {
        lugares.add(new Lugar("UADY", 20.969631631397835, -89.62286279943623, R.drawable.uady, R.drawable.uady1));
        lugares.add(new Lugar("Tec de Mérida", 21.011702431702616, -89.62355212715306, R.drawable.tec, R.drawable.tec1));
        lugares.add(new Lugar("UPY", 20.987957534379653, -89.73668760236815, R.drawable.upy, R.drawable.upy1));
        lugares.add(new Lugar("UTM", 20.939618899257066, -89.61531774547734, R.drawable.utm, R.drawable.utm1));
    }
}
