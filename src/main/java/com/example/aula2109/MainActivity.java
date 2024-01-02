package com.example.aula2109;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private Intent it;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
    }

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        //adicionar o menu na active_main
        MenuInflater i = getMenuInflater();
        i.inflate(R.menu.menu_principal,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.itemSair:
                finish();
                break;
            case R.id.itemCombo:
                it = new Intent(this,Combo.class);
                startActivity(it);
                break;
            case R.id.itemLista:
                it = new Intent(this,Lista.class);
                startActivity(it);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}