package com.example.himym;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class Phrases extends AppCompatActivity {

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
        phrasesList.add(new ModelClass(R.drawable.barneylegend, "It's gonna be Legen waitforit Dary!", "_______________________"));
        phrasesList.add(new ModelClass(R.drawable.barneysuitup, "Suit Up!", "_______________________"));
        phrasesList.add(new ModelClass(R.drawable.robinfeeling, "I really don't like feelings", "_______________________"));
        phrasesList.add(new ModelClass(R.drawable.slapsgiving, "Happy Slapsgiving!", "_______________________"));
        phrasesList.add(new ModelClass(R.drawable.tedhaveyou, "Haaaave you met Ted?", "_______________________"));
        phrasesList.add(new ModelClass(R.drawable.happywife, "Happy wife equals happy life", "_______________________"));
    }
}