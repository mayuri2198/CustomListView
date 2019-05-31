package com.example.customlistview;

import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView simplelist;
ArrayList<Item> animalList=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simplelist=findViewById(R.id.simplelist);
        animalList.add(new Item("Jellyfish",R.raw.jellyfish));
        animalList.add(new Item("koala",R.raw.koala));
        MyAdapter myAdapter = new MyAdapter(this,R.layout.activity_main,animalList);
        simplelist.setAdapter(myAdapter);

    }
}
