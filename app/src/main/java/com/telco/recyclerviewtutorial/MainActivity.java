package com.telco.recyclerviewtutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    String s1[],s2[];
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.progLang);
        s1 = getResources().getStringArray(R.array.programmingLanguages);
        s2 = getResources().getStringArray(R.array.description);
        MyAdapter adatpter = new MyAdapter(s1,s2,this);
        recyclerView.setAdapter(adatpter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}