package com.example.dailygroceries.Adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dailygroceries.AllCategory;
import com.example.dailygroceries.Model.AllCategoryModel;
import com.example.dailygroceries.Model.Category;
import com.example.dailygroceries.R;

import java.util.List;

public class AllCategoryAdapter extends RecyclerView.Adapter<AllCategoryAdapter.MyHolder> {


    Context context;
    List<AllCategoryModel> categoryList;

    public AllCategoryAdapter(Context context, List<AllCategoryModel> categoryList) {
        this.context = context;
        this.categoryList = categoryList;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.all_category_row_items,parent,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.categoryImage.setImageResource(Integer.parseInt(categoryList.get(position).getImageurl()));
    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    public static class MyHolder extends RecyclerView.ViewHolder{
        ImageView categoryImage;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            categoryImage=itemView.findViewById(R.id.categoryImage);
        }
    }
}
