package com.example.myproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.myproject.adapter.loaisanphamAdapter;
import com.example.myproject.adapter.shopAdapter;
import com.example.myproject.model.dataloaisanpham;
import com.example.myproject.model.datashop;

import java.util.ArrayList;

public class loaisanpham extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loaisanpham);
        initView();
    }

    private void initView() {
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerviewloaisp);
        recyclerView.setHasFixedSize(true);
        //RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(),2);
        //recyclerView.setLayoutManager(layoutManager);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        DividerItemDecoration itemDecoration = new DividerItemDecoration(this,layoutManager.getOrientation());
        recyclerView.addItemDecoration(itemDecoration);
        ArrayList<dataloaisanpham> arrayList = new ArrayList<>();
        arrayList.add(new dataloaisanpham(R.drawable.logo,"So mi","1200"));
        arrayList.add(new dataloaisanpham(R.drawable.logo,"So mi","1200"));
        arrayList.add(new dataloaisanpham(R.drawable.logo,"So mi","1200"));
        arrayList.add(new dataloaisanpham(R.drawable.logo,"So mi","1200"));
        arrayList.add(new dataloaisanpham(R.drawable.logo,"So mi","1200"));
        arrayList.add(new dataloaisanpham(R.drawable.logo,"So mi","1200"));
        arrayList.add(new dataloaisanpham(R.drawable.logo,"So mi","1200"));
        arrayList.add(new dataloaisanpham(R.drawable.logo,"So mi","1200"));
        arrayList.add(new dataloaisanpham(R.drawable.logo,"So mi","1200"));
        arrayList.add(new dataloaisanpham(R.drawable.logo,"So mi","1200"));
        arrayList.add(new dataloaisanpham(R.drawable.logo,"So mi","1200"));
        arrayList.add(new dataloaisanpham(R.drawable.logo,"So mi","1200"));
        arrayList.add(new dataloaisanpham(R.drawable.logo,"So mi","1200"));
        arrayList.add(new dataloaisanpham(R.drawable.logo,"So mi","1200"));
        arrayList.add(new dataloaisanpham(R.drawable.logo,"So mi","1200"));
        arrayList.add(new dataloaisanpham(R.drawable.logo,"So mi","1200"));
        arrayList.add(new dataloaisanpham(R.drawable.logo,"So mi","1200"));

        loaisanphamAdapter loaisanphamAdapter = new loaisanphamAdapter(arrayList,getApplicationContext());
        recyclerView.setAdapter(loaisanphamAdapter);
    }
}
