package com.example.fragment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainRecycleView extends AppCompatActivity {
    private RecyclerView rvHero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_item_hero);

        rvHero = findViewById(R.id.activitymain_rv_hero);
        rvHero.setHasFixedSize(true);

        showRecycleList();
    }

    private void showRecycleList() {
        rvHero.setLayoutManager(new LinearLayoutManager(this));

        HeroesAdapter heroesAdapter = new HeroesAdapter(this);
        heroesAdapter.setHeroes(HeroesData.getHeroesList());

        rvHero.setAdapter(heroesAdapter);
    }
}
