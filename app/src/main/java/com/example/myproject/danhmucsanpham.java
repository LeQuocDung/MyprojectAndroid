package com.example.myproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.myproject.adapter.danhmucsanphamAdapter;
import com.example.myproject.adapter.loaisanphamAdapter;
import com.example.myproject.model.datadanhmucsanpham;
import com.example.myproject.model.dataloaisanpham;

import java.util.ArrayList;

public class danhmucsanpham extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danhmucsanpham);
        initView();
    }

    private void initView() {

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerviewdanhmucsp);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(),3);
        recyclerView.setLayoutManager(layoutManager);
        //DividerItemDecoration itemDecoration = new DividerItemDecoration(this, ((GridLayoutManager) layoutManager).getOrientation());
        //recyclerView.addItemDecoration(itemDecoration);
        ArrayList<datadanhmucsanpham> arrayList = new ArrayList<>();
        arrayList.add(new datadanhmucsanpham(R.drawable.logo, "Đồ nam"));
        arrayList.add(new datadanhmucsanpham(R.drawable.logo, "Đồ Nữ"));
        arrayList.add(new datadanhmucsanpham(R.drawable.logo, "Giày dép"));
        arrayList.add(new datadanhmucsanpham(R.drawable.logo, "Khuyến mãi"));
        arrayList.add(new datadanhmucsanpham(R.drawable.logo, "Tất cả"));
        arrayList.add(new datadanhmucsanpham(R.drawable.logo, "Đồ nam"));
        arrayList.add(new datadanhmucsanpham(R.drawable.logo, "Đồ Nữ"));
        arrayList.add(new datadanhmucsanpham(R.drawable.logo, "Giày dép"));
        arrayList.add(new datadanhmucsanpham(R.drawable.logo, "Khuyến mãi"));
        arrayList.add(new datadanhmucsanpham(R.drawable.logo, "Tất cả"));

        danhmucsanphamAdapter danhmucsanphamAdapter = new danhmucsanphamAdapter(arrayList, getApplicationContext());
        recyclerView.setAdapter(danhmucsanphamAdapter);
    }
}
