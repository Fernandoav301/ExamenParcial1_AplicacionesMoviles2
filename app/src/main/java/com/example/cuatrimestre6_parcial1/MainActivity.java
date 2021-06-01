package com.example.cuatrimestre6_parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView) findViewById(R.id.List);
        String[] nombre= {"Mercurio", "Venus", "Tierra", "Marte", "Júpiter" , "Saturno", "Urano", "Neptuno"};
        String[] planeta= {"1", "2", "3", "4", "5", "6", "7", "8"};
        Integer[] idimage= {R.mipmap.mercurio,R.mipmap.venus,R.mipmap.tierra,R.mipmap.marte,R.mipmap.jupiter,R.mipmap.saturno,R.mipmap.urano,R.mipmap.neptuno};
        AdapterList adapter = new AdapterList( this,nombre,planeta,idimage);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Seleccionaste el planeta: " +nombre[position],Toast.LENGTH_LONG).show();

            }
        });

    }
}