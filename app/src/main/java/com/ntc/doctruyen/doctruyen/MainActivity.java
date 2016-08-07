package com.ntc.doctruyen.doctruyen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import com.ntc.doctruyen.adapter.AdapterTruyen;
import com.ntc.doctruyen.models.Truyen;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lvTruyen;
    private ArrayList<Truyen> arrTruyen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvTruyen = (ListView) findViewById(R.id.lv_truyen);
        arrTruyen = new ArrayList<>();
        arrTruyen.add(new Truyen(R.mipmap.ic_launcher,"truyen 1"));
        arrTruyen.add(new Truyen(R.mipmap.ic_launcher,"truyen 2"));
        arrTruyen.add(new Truyen(R.mipmap.ic_launcher,"truyen 3"));
        arrTruyen.add(new Truyen(R.mipmap.ic_launcher,"truyen 4"));
        arrTruyen.add(new Truyen(R.mipmap.ic_launcher,"truyen 5"));
        arrTruyen.add(new Truyen(R.mipmap.ic_launcher,"truyen 6"));
        AdapterTruyen adapterTruyen = new AdapterTruyen(this,R.layout.item_truyen,arrTruyen);
        lvTruyen.setAdapter(adapterTruyen);
        lvTruyen.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d("test","cham vao vi tri thu : " + i);
            }
        });
    }
}
