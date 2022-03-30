package com.example.dailygroceries.Database;

import com.example.dailygroceries.Model.DiscountedProducts;
import com.example.dailygroceries.R;


import java.util.ArrayList;
import java.util.List;

public class DiscountItemDataBase {

    public List<DiscountedProducts> getDiscountItemsFromDatabase() {
        List<DiscountedProducts> discountedProductsList = new ArrayList<>();
        discountedProductsList.add(new DiscountedProducts(1, String.valueOf(R.drawable.garden4)));
        discountedProductsList.add(new DiscountedProducts(2, String.valueOf(R.drawable.garden5)));
        discountedProductsList.add(new DiscountedProducts(3, String.valueOf(R.drawable.garden6)));
        discountedProductsList.add(new DiscountedProducts(4, String.valueOf(R.drawable.garden4)));
        discountedProductsList.add(new DiscountedProducts(5, String.valueOf(R.drawable.garden5)));
        discountedProductsList.add(new DiscountedProducts(6, String.valueOf(R.drawable.garden6)));
        discountedProductsList.add(new DiscountedProducts(7, String.valueOf(R.drawable.garden4)));
        discountedProductsList.add(new DiscountedProducts(8, String.valueOf(R.drawable.garden5)));
        discountedProductsList.add(new DiscountedProducts(9, String.valueOf(R.drawable.garden6)));
        discountedProductsList.add(new DiscountedProducts(10, String.valueOf(R.drawable.garden4)));
        discountedProductsList.add(new DiscountedProducts(11, String.valueOf(R.drawable.garden5)));
        discountedProductsList.add(new DiscountedProducts(12, String.valueOf(R.drawable.garden6)));
        discountedProductsList.add(new DiscountedProducts(13, String.valueOf(R.drawable.garden4)));
        discountedProductsList.add(new DiscountedProducts(14, String.valueOf(R.drawable.garden5)));
        discountedProductsList.add(new DiscountedProducts(15, String.valueOf(R.drawable.garden6)));
        discountedProductsList.add(new DiscountedProducts(16, String.valueOf(R.drawable.garden4)));
        discountedProductsList.add(new DiscountedProducts(17, String.valueOf(R.drawable.garden5)));
        discountedProductsList.add(new DiscountedProducts(18, String.valueOf(R.drawable.garden6)));
        discountedProductsList.add(new DiscountedProducts(19, String.valueOf(R.drawable.garden4)));
        discountedProductsList.add(new DiscountedProducts(20, String.valueOf(R.drawable.garden5)));
        discountedProductsList.add(new DiscountedProducts(21, String.valueOf(R.drawable.garden6)));
        discountedProductsList.add(new DiscountedProducts(22, String.valueOf(R.drawable.garden4)));
        discountedProductsList.add(new DiscountedProducts(23, String.valueOf(R.drawable.garden5)));
        discountedProductsList.add(new DiscountedProducts(24, String.valueOf(R.drawable.garden6)));
        discountedProductsList.add(new DiscountedProducts(25, String.valueOf(R.drawable.garden6)));
        discountedProductsList.add(new DiscountedProducts(26, String.valueOf(R.drawable.garden4)));
        discountedProductsList.add(new DiscountedProducts(27, String.valueOf(R.drawable.garden5)));
        discountedProductsList.add(new DiscountedProducts(28, String.valueOf(R.drawable.garden6)));
        discountedProductsList.add(new DiscountedProducts(29, String.valueOf(R.drawable.garden4)));
        discountedProductsList.add(new DiscountedProducts(30, String.valueOf(R.drawable.garden5)));

        return discountedProductsList;
    }
}
