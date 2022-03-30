package com.example.dailygroceries.Database;


import com.example.dailygroceries.Model.RecentlyViewed;
import com.example.dailygroceries.R;

import java.util.ArrayList;
import java.util.List;

public class RecentlyViewedDatabase {
    public List<RecentlyViewed> getRecentlyViewedItemsFromDatabase() {
        List<RecentlyViewed> recentlyViewedList = new ArrayList<>();
        recentlyViewedList.add(new RecentlyViewed("banana","this is banana","$250","5","KG",R.drawable.banana));
        recentlyViewedList.add(new RecentlyViewed("apple", "this is apple","$20","100","KG",R.drawable.apple));
        recentlyViewedList.add(new RecentlyViewed("orange","this is orange","$300","90","KG",R.drawable.orange));
        recentlyViewedList.add(new RecentlyViewed("strawberry","this is strawberry","$800","1","KG",R.drawable.strawberry));


        return recentlyViewedList;
    }
}
