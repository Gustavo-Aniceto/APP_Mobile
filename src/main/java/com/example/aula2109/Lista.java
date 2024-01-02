package com.example.aula2109;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Lista extends AppCompatActivity {

    private ListView lsvCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        lsvCliente = findViewById(R.id.lsvClientes);
        //fonte de dados
        String[] clientes = {"Fulano", "Ciclano", "Beltrano", "astrolabio"};

        //adaptador do listview
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, clientes);

        //rerlacionando o adaptador ao componente ListLiew
        lsvCliente.setAdapter(adaptador);

        //implementacao do evento de click do item

        lsvCliente.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {


                String nome = String.valueOf(parent.getAdapter().getItem(position));
                Toast.makeText(getApplication(), nome, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
