package com.example.himym;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class Cast extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass>phrasesList;
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        initData();
        initRecycler();

    }

    private void initRecycler() {
        recyclerView= findViewById(R.id.recyclerView);
        layoutManager= new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter= new MyAdapter(phrasesList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private void initData() {
        phrasesList = new ArrayList<>();
        phrasesList.add(new ModelClass(R.drawable.introted, "Ted Mosby: Josh Radmor", "_______________________"));
        phrasesList.add(new ModelClass(R.drawable.intromarshal, "Marshall Eriksen: Jason Segel", "_______________________"));
        phrasesList.add(new ModelClass(R.drawable.introrobin, "Robin Scherbatsky: Cobie Smulders", "_______________________"));
        phrasesList.add(new ModelClass(R.drawable.introbarney, "Barney Stinson: Neil Patrick Harris", "_______________________"));
        phrasesList.add(new ModelClass(R.drawable.introlily, "Lily Aldrin: Alyson Hannigan", "_______________________"));
        phrasesList.add(new ModelClass(R.drawable.tracyintro, "Tracy McConnell: Cristin Milioti", "_______________________"));
    }
}