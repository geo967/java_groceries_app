package com.example.dailygroceries;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dailygroceries.Adapter.AllCategoryAdapter;
import com.example.dailygroceries.Adapter.DiscountedProductAdapter;
import com.example.dailygroceries.Database.AllCategoryItemDatabase;
import com.example.dailygroceries.Model.AllCategoryModel;

import java.util.ArrayList;
import java.util.List;

public class AllCategory extends AppCompatActivity {

    RecyclerView allCategoryRecycler;
    AllCategoryAdapter allCategoryAdapter;
    List<AllCategoryModel> allCategoryList=new ArrayList<>();
    AllCategoryItemDatabase allCategoryItemDatabase=new AllCategoryItemDatabase();

    ImageView backButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_category);

        allCategoryRecycler=findViewById(R.id.allCategoryRecyclerLayout);
        allCategoryList= allCategoryItemDatabase.getCategoryItemsFromDatabase();
        backButton=findViewById(R.id.back_button);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AllCategory.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        RecyclerView.LayoutManager layoutManager=new GridLayoutManager(this,4);
        allCategoryRecycler.setLayoutManager(layoutManager);
        allCategoryAdapter=new AllCategoryAdapter(this,allCategoryList);
        allCategoryRecycler.setAdapter(allCategoryAdapter);


    }
}
