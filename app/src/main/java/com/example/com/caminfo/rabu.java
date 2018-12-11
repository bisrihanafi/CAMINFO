package com.example.com.caminfo;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class rabu extends ListActivity {
    String [] rabu ={"MATEMATIKA", "PEMROGRAMAN"};
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rabu);

        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, rabu));

    }
}