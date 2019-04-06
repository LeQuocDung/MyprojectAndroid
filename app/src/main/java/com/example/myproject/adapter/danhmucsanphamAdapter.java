package com.example.myproject.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myproject.R;
import com.example.myproject.model.datadanhmucsanpham;

import java.util.ArrayList;

public class danhmucsanphamAdapter extends RecyclerView.Adapter<danhmucsanphamAdapter.ViewHolder> {
    ArrayList<datadanhmucsanpham> datadanhmucsanphams;
    Context context;

    public danhmucsanphamAdapter(ArrayList<datadanhmucsanpham> datadanhmucsanphams, Context context) {
        this.datadanhmucsanphams = datadanhmucsanphams;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.item_row_danhmucsanpham,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.textTenDanhMuc.setText(datadanhmucsanphams.get(i).getTenLoai());
        viewHolder.imageDanhMuc.setImageResource(datadanhmucsanphams.get(i).getAnhnen());
    }

    @Override
    public int getItemCount() {
        return datadanhmucsanphams.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView textTenDanhMuc;
        ImageView imageDanhMuc;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textTenDanhMuc = (TextView)itemView.findViewById(R.id.txtnamedm);
            imageDanhMuc = (ImageView)itemView.findViewById(R.id.Imagedm);

        }
    }
}
