package com.example.french;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
                adapter = new Adapter(this, getModelList());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    public ArrayList<Model> getModelList(){

        ArrayList<Model> modellist = new ArrayList<>();


        Model m = new Model();
        m.setBtn_name("Le présent");
        m.setaClass(SecondActivity.class);

        modellist.add(m);

        m = new Model();
        m.setBtn_name("Le passé composé");
        m.setaClass(SecondActivity.class);

        modellist.add(m);

        m.setBtn_name("L’imparfait");
        m.setaClass(SecondActivity.class);

        modellist.add(m);

        m.setBtn_name("Le passé récent");
        m.setaClass(SecondActivity.class);

        modellist.add(m);

        m.setBtn_name("Le passé simple");
        m.setaClass(SecondActivity.class);

        modellist.add(m);

        m.setBtn_name("Le plus-que-parfait");
        m.setaClass(SecondActivity.class);

        modellist.add(m);

        m.setBtn_name("Le futur proche");
        m.setaClass(SecondActivity.class);

        modellist.add(m);

        m.setBtn_name("Le futur simple");
        m.setaClass(SecondActivity.class);

        modellist.add(m);

        m.setBtn_name("Le futur antérieur");
        m.setaClass(SecondActivity.class);

        modellist.add(m);

        return modellist;



    }
}
