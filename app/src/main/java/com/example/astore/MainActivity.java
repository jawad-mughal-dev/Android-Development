package com.example.astore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    ArrayList<productModel> product = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create a tool bar
        toolbar = findViewById(R.id.toolBar);

        //setup 1
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        RecyclerView recyclerView = findViewById(R.id.rvProduct);

        recyclerView.setLayoutManager(new GridLayoutManager( this , 2));

        // Create productModel instances with random data and different drawables
        product.add(new productModel(R.drawable.e , "Product 1" , "Rs 800", "Rs 300", 4.4F));
        product.add(new productModel(R.drawable.e , "Product 2" , "Rs 600", "Rs 250", 4.0F));
        product.add(new productModel(R.drawable.e , "Product 3" , "Rs 900", "Rs 400", 4.8F));
        product.add(new productModel(R.drawable.e , "Product 4" , "Rs 700", "Rs 350", 4.2F));
        product.add(new productModel(R.drawable.e , "Product 5" , "Rs 1000", "Rs 500", 4.5F));
        product.add(new productModel(R.drawable.e , "Product 6" , "Rs 1200", "Rs 600", 4.6F));
        product.add(new productModel(R.drawable.e , "Product 7" , "Rs 500", "Rs 200", 3.9F));
        product.add(new productModel(R.drawable.e , "Product 8" , "Rs 1100", "Rs 450", 4.7F));
        product.add(new productModel(R.drawable.e , "Product 9" , "Rs 850", "Rs 320", 4.3F));
        product.add(new productModel(R.drawable.e , "Product 10", "Rs 950", "Rs 380", 4.1F));



        RecyclerProductAdaptor adaptor = new RecyclerProductAdaptor(this, product);
        recyclerView.setAdapter(adaptor);
    }
}