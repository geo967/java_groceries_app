package com.example.dailygroceries.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dailygroceries.Model.RecentlyViewed;
import com.example.dailygroceries.ProductDetails;
import com.example.dailygroceries.R;


import java.util.List;

public class RecentlyViewedAdapter extends RecyclerView.Adapter<RecentlyViewedAdapter.MyHolder> {
    Context context;
    List<RecentlyViewed> recentlyViewedList;

    public RecentlyViewedAdapter(Context context, List<RecentlyViewed> recentlyViewedList) {
        this.context = context;
        this.recentlyViewedList = recentlyViewedList;
    }

    @NonNull
    @Override
    public RecentlyViewedAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.recently_viewed_items,parent,false);

        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecentlyViewedAdapter.MyHolder holder, int position) {

        holder.name.setText(recentlyViewedList.get(position).getName());
        holder.description.setText(recentlyViewedList.get(position).getDescription());
        holder.price.setText(recentlyViewedList.get(position).getPrice());
        holder.qty.setText(recentlyViewedList.get(position).getQuantity());
        holder.unit.setText(recentlyViewedList.get(position).getUnit());
        holder.bg.setBackgroundResource(recentlyViewedList.get(position).getImageUrl());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(context, ProductDetails.class);
                intent.putExtra("name",recentlyViewedList.get(position).getName());
                intent.putExtra("image",recentlyViewedList.get(position).getImageUrl());
                intent.putExtra("price",recentlyViewedList.get(position).getPrice());
                intent.putExtra("qty",recentlyViewedList.get(position).getQuantity());
                intent.putExtra("unit",recentlyViewedList.get(position).getUnit());
                intent.putExtra("desc",recentlyViewedList.get(position).getDescription());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return recentlyViewedList.size();
    }

    public static class MyHolder extends RecyclerView.ViewHolder {
        TextView name,description,price,qty,unit;
        ConstraintLayout bg;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.textView4);
            description=itemView.findViewById(R.id.textView6);
            price=itemView.findViewById(R.id.textView7);
            qty=itemView.findViewById(R.id.textView8);
            unit=itemView.findViewById(R.id.textView9);
            bg=itemView.findViewById(R.id.recently_viewed);
        }
    }
}
