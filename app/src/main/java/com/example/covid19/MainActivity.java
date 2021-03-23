package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    Data datanya;
    RecyclerView rvkorona;
    RecyclerView.LayoutManager layoutnya;
    KoronaAdapter adapternya;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvkorona=(RecyclerView)findViewById(R.id.rv_korona);
        layoutnya=new LinearLayoutManager(this);
        rvkorona.setLayoutManager(layoutnya);
        Intent dapet=getIntent();
        datanya=(Data)dapet.getSerializableExtra("barang");
        adapternya=new KoronaAdapter(datanya,MainActivity.this);
        rvkorona.setAdapter(adapternya);
    }
}