package com.example.astore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<productModel> product = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recyclerView = findViewById(R.id.rvProduct);

        recyclerView.setLayoutManager(new GridLayoutManager( this , 2));

        // Create productModel instances with random data and different drawables
        product.add(new productModel(R.drawable.e , "product 1" , "800", "300", 4.4F));
        product.add(new productModel(R.drawable.e , "product 2" , "600", "250", 4.0F));
        product.add(new productModel(R.drawable.e , "product 3" , "900", "400", 4.8F));
        product.add(new productModel(R.drawable.e , "product 4" , "700", "350", 4.2F));
        product.add(new productModel(R.drawable.e , "product 5" , "1000", "500", 4.5F));
        product.add(new productModel(R.drawable.e , "product 6" , "1200", "600", 4.6F));
        product.add(new productModel(R.drawable.e , "product 7" , "500", "200", 3.9F));
        product.add(new productModel(R.drawable.e , "product 8" , "1100", "450", 4.7F));
        product.add(new productModel(R.drawable.e , "product 9" , "850", "320", 4.3F));
        product.add(new productModel(R.drawable.e , "product 10", "950", "380", 4.1F));


        RecyclerProductAdaptor adaptor = new RecyclerProductAdaptor(this, product);
        recyclerView.setAdapter(adaptor);
    }
}