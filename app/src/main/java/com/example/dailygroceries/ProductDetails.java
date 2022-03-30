package com.example.dailygroceries;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ProductDetails extends AppCompatActivity {
    ImageView img;
    TextView proName,proPrice,proDesc;
    ImageView backButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_details);

        proName=findViewById(R.id.product_name);
        proDesc=findViewById(R.id.product_desc);
        proPrice=findViewById(R.id.prod_price);
        img=findViewById(R.id.big_image);
        

        Intent i=getIntent();

        String name=i.getStringExtra("name");
        int image=i.getIntExtra("image",R.drawable.orange);
        String price=i.getStringExtra("price");
        String desc=i.getStringExtra("desc");

        proName.setText(name);
        proPrice.setText(price);
        proDesc.setText(desc);
        img.setImageResource(image);
    }

    public void backButton(View view) {
        Intent intent =new Intent(ProductDetails.this,MainActivity.class);
        startActivity(intent);
    }
}
