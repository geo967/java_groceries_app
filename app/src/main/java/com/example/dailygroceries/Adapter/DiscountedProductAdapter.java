package com.example.dailygroceries.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dailygroceries.Model.DiscountedProducts;
import com.example.dailygroceries.R;

import java.util.List;

public class DiscountedProductAdapter extends RecyclerView.Adapter<DiscountedProductAdapter.MyHolder> {

    Context context;
    List<DiscountedProducts> discountedProductsList;

    public DiscountedProductAdapter(Context context, List<DiscountedProducts> discountedProductsList) {
        this.context = context;
        this.discountedProductsList = discountedProductsList;
    }

    @NonNull
    @Override
    public DiscountedProductAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.discounted_row_items,parent,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DiscountedProductAdapter.MyHolder holder, int position) {
           holder.discountImageView.setImageResource(Integer.parseInt(discountedProductsList.get(position).getImageurl()));
    }

    @Override
    public int getItemCount() {
        return discountedProductsList.size();
    }

    public static class MyHolder extends RecyclerView.ViewHolder {
        ImageView discountImageView;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            discountImageView=itemView.findViewById(R.id.discountImage);
        }
    }
}
