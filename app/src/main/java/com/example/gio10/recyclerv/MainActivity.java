package com.example.gio10.recyclerv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> names;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        names = this.getAllNames();
        mRecyclerView = findViewById(R.id.recyclerView);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new MyAdapter(names, R.layout.recycle_view_item, new MyAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(String name, int position) {
                Toast.makeText(MainActivity.this, name + " - " + position, Toast.LENGTH_LONG).show();
            }
        });

        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(mLayoutManager);

    }

    private List<String> getAllNames(){
        return new ArrayList<String>(){{
            add("GIOVAN HERRERA");
            add("SANTIAGO");
            add("ALEJANDRO");
            add("DANILO");
            add("ARNOLDO");
            add("GIOVANNY");
            add("CRISTIANO");
            add("FABRICIO");
            add("JORGE");
            add("ANDRES");
            add("RICARDO");
            add("RAFAEL");
        }};
    }
}
