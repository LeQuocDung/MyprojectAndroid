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
import com.example.myproject.model.dataloaisanpham;

import java.util.ArrayList;

public class loaisanphamAdapter extends RecyclerView.Adapter<loaisanphamAdapter.ViewHolder>{
    ArrayList<dataloaisanpham> dataloaisanphams;
    Context context;

    public loaisanphamAdapter(ArrayList<dataloaisanpham> dataloaisanphams, Context context) {
        this.dataloaisanphams = dataloaisanphams;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.tem_row_loaisanpham,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.txtname.setText(dataloaisanphams.get(i).getTen());
        viewHolder.txtgia.setText(dataloaisanphams.get(i).getGia());
        viewHolder.imghinh.setImageResource(dataloaisanphams.get(i).getHinhanh());
    }

    @Override
    public int getItemCount() {
        return dataloaisanphams.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtname;
        TextView txtgia;
        ImageView imghinh;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtname = (TextView)itemView.findViewById(R.id.txtname);
            txtgia = (TextView)itemView.findViewById(R.id.imgdesc);
            imghinh = (ImageView)itemView.findViewById(R.id.txtImage);

        }
    }
}
