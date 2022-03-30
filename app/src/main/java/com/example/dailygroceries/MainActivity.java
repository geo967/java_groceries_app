package com.example.dailygroceries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SearchView;

import com.example.dailygroceries.Adapter.CategoryAdapter;
import com.example.dailygroceries.Adapter.DiscountedProductAdapter;
import com.example.dailygroceries.Adapter.RecentlyViewedAdapter;
import com.example.dailygroceries.Database.CategoryItemDatabase;
import com.example.dailygroceries.Database.DiscountItemDataBase;
import com.example.dailygroceries.Database.RecentlyViewedDatabase;
import com.example.dailygroceries.Model.Category;
import com.example.dailygroceries.Model.DiscountedProducts;
import com.example.dailygroceries.Model.RecentlyViewed;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView discountRecyclerView,categoryRecyclerView,recentlyViewedRecycler;

    DiscountedProductAdapter discountedProductAdapter;
    List<DiscountedProducts> discountedProductsList;

    DiscountItemDataBase discountItemDataBase=new DiscountItemDataBase();
    CategoryItemDatabase categoryItemDataBase=new CategoryItemDatabase();
    RecentlyViewedDatabase recentlyViewedDatabase=new RecentlyViewedDatabase();

    CategoryAdapter categoryAdapter;
    List<Category> categoryList;

    RecentlyViewedAdapter recentlyViewedAdapter;
    List<RecentlyViewed> recentlyViewedList;

    ImageView allCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SearchView mySearch=findViewById(R.id.editTextTextPersonName);

        discountRecyclerView=findViewById(R.id.discountedRecycler);
        categoryRecyclerView=findViewById(R.id.categoryRecycler);
        allCategory=findViewById(R.id.imageView4);
        recentlyViewedRecycler=findViewById(R.id.recently_viewed_recycler);

        discountedProductsList=discountItemDataBase.getDiscountItemsFromDatabase();
        categoryList=categoryItemDataBase.getCategoryItemsFromDatabase();
        recentlyViewedList=recentlyViewedDatabase.getRecentlyViewedItemsFromDatabase();


        setDiscountedRecycler(discountedProductsList);
        setCategoryRecycler(categoryList);
        setRecentlyViewedRecycler(recentlyViewedList);

        allCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,AllCategory.class);
                startActivity(intent);
            }
        });



    }

    private void setDiscountedRecycler(List<DiscountedProducts> dataList) {
        discountRecyclerView=findViewById(R.id.discountedRecycler);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        discountRecyclerView.setLayoutManager(layoutManager);
        discountedProductAdapter=new DiscountedProductAdapter(this,dataList);
        discountRecyclerView.setAdapter(discountedProductAdapter);
    }

    private void setCategoryRecycler(List<Category> categoryDataList) {
        categoryRecyclerView=findViewById(R.id.categoryRecycler);
        RecyclerView.LayoutManager layoutManager=new GridLayoutManager(this,4);
        categoryRecyclerView.setLayoutManager(layoutManager);
        categoryAdapter=new CategoryAdapter(this,categoryDataList);
        categoryRecyclerView.setAdapter(categoryAdapter);
    }

    private void setRecentlyViewedRecycler(List<RecentlyViewed> recentlyViewedList) {
        recentlyViewedRecycler=findViewById(R.id.recently_viewed_recycler);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recentlyViewedRecycler.setLayoutManager(layoutManager);
        recentlyViewedAdapter=new RecentlyViewedAdapter(this,recentlyViewedList);
        recentlyViewedRecycler.setAdapter(recentlyViewedAdapter);
    }
}