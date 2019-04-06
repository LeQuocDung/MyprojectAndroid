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
import com.example.myproject.model.datashop;

import java.util.ArrayList;

public class shopAdapter extends RecyclerView.Adapter<shopAdapter.viewHolder>{
    ArrayList<datashop> datashops;
    Context context;

    public shopAdapter(ArrayList<datashop> datashops, Context context) {
        this.datashops = datashops;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.item_row_recyclerview,viewGroup,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder viewHolder, int i) {
        viewHolder.txtname.setText(datashops.get(i).getTen());
        viewHolder.txtgia.setText(datashops.get(i).getGia());
        viewHolder.txtgioithieu.setText(datashops.get(i).getGioithieu());
        viewHolder.imghinh.setImageResource(datashops.get(i).getHinhanh());
    }

    @Override
    public int getItemCount() {
        return datashops.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder
    {
        TextView txtname;
        TextView txtgia;
        TextView txtgioithieu;
        ImageView imghinh;

        public viewHolder(View itemView) {
            super(itemView);
            txtname = (TextView)itemView.findViewById(R.id.txtten);
            txtgia = (TextView)itemView.findViewById(R.id.txtgia);
            txtgioithieu = (TextView)itemView.findViewById(R.id.txtgioithieu);
            imghinh = (ImageView)itemView.findViewById(R.id.imageview_item);

        }
    }
}
