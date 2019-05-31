package com.example.customlistview;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

class MyAdapter extends ArrayAdapter {
    ArrayList<Item> animalList;

    public MyAdapter(MainActivity mainActivity, int activity_main, ArrayList<Item> simplelist) {
        super(mainActivity,activity_main, simplelist);
        animalList=simplelist;
    }

    @Override
    public int getCount()
    {
        return super.getCount();

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v=convertView;
        LayoutInflater inflater=(LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);//layout inflater squizes(arranges) the item_activity items
        v=inflater.inflate(R.layout.activity_main,null);
        TextView textView=v.findViewById(R.id.textView);
        ImageView imageView=v.findViewById(R.id.imageView);
        textView.setText(animalList.get(position).getAnimalName());
        imageView.setImageResource(animalList.get(position).getAnimalImage());
        return v;
    }
}
