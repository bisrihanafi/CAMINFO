package com.example.com.caminfo;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class selasa extends ListActivity {
    String [] selasa ={"MATEMATIKA", "PEMROGRAMAN"};
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selasa);

        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, selasa));

    }
}