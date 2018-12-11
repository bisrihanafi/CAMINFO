package com.example.com.caminfo;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
public class senin extends ListActivity {
    String [] senin ={"MATEMATIKA", "PEMROGRAMAN"};
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.senin);

        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, senin));

    }
}