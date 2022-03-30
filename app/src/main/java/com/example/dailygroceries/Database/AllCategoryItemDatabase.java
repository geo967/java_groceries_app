package com.example.dailygroceries.Database;

import com.example.dailygroceries.Model.AllCategoryModel;
import com.example.dailygroceries.Model.Category;
import com.example.dailygroceries.R;

import java.util.ArrayList;
import java.util.List;

public class AllCategoryItemDatabase {
    public List<AllCategoryModel> getCategoryItemsFromDatabase(){
        List<AllCategoryModel> allCategoryList=new ArrayList<>();
        allCategoryList.add(new AllCategoryModel(1,String.valueOf(R.drawable.flower1)));
        allCategoryList.add(new AllCategoryModel(1,String.valueOf(R.drawable.flower2)));
        allCategoryList.add(new AllCategoryModel(1,String.valueOf(R.drawable.flower3)));
        allCategoryList.add(new AllCategoryModel(1,String.valueOf(R.drawable.flower4)));
        allCategoryList.add(new AllCategoryModel(1,String.valueOf(R.drawable.flower5)));
        allCategoryList.add(new AllCategoryModel(1,String.valueOf(R.drawable.flower6)));
        allCategoryList.add(new AllCategoryModel(1,String.valueOf(R.drawable.flower8)));
        allCategoryList.add(new AllCategoryModel(1,String.valueOf(R.drawable.flower9)));
        allCategoryList.add(new AllCategoryModel(1,String.valueOf(R.drawable.flower10)));
        allCategoryList.add(new AllCategoryModel(1,String.valueOf(R.drawable.flower11)));
        allCategoryList.add(new AllCategoryModel(1,String.valueOf(R.drawable.flower12)));
        allCategoryList.add(new AllCategoryModel(1,String.valueOf(R.drawable.flower13)));




        return allCategoryList;}
}
