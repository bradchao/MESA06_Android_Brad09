package com.example.user.brad09;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private SimpleAdapter adapter;
    private LinkedList<HashMap<String,String>> data;    // 資料集
    private String[] from = {"title"};
    private int[] to = {R.id.item_tv};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listView);
        initListView();
    }

    private void initListView(){
        data = new LinkedList<>();

        for (int i=0; i<20; i++) {
            HashMap<String, String> row0 = new HashMap<>();   // 一筆資料
            row0.put(from[0], "PPAP:" + i);
            data.add(row0);
        }





        adapter = new SimpleAdapter(
                this, data, R.layout.layout_item,from,to);
        listView.setAdapter(adapter);
    }
}
