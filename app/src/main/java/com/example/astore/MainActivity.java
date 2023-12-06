package com.example.astore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<productModel> product = new ArrayList<>();

    RecyclerProductAdaptor adaptor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recyclerView = findViewById(R.id.rvProduct);

        recyclerView.setLayoutManager(new GridLayoutManager( this , 2));

        // create a floating product for attached different actions
        FloatingActionButton fbForProdudct = findViewById(R.id.fbForProdudct);


        fbForProdudct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.dialoglayoutforupdateproduct);

                //Find ids becuase we want to get data from
                TextView tvProductFormName = dialog.findViewById(R.id.tvProductFormName);
                EditText etProductName = dialog.findViewById(R.id.etProductName);
                EditText etProductPrice = dialog.findViewById(R.id.etProductPrice);
                Button btnSubmitProduct = dialog.findViewById(R.id.btnSubmitProduct);





                // we need to get data on the form click
                btnSubmitProduct.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // very import give the intial value
                        String name = "" , price = "";
                        if (!etProductName.getText().toString().equals("")) {
                            name = etProductName.getText().toString();

                        } else {
                            Toast.makeText(MainActivity.this, "Please Enter Product Name", Toast.LENGTH_SHORT).show();
                        }

                        if (!etProductPrice.getText().toString().equals("")) {
                            price = etProductPrice.getText().toString();

                        } else {
                            Toast.makeText(MainActivity.this, "Please Enter Product Price", Toast.LENGTH_SHORT).show();
                        }
                        product.add(new productModel( name , price , R.drawable.e ));
                        adaptor.notifyItemInserted(product.size()-1);
                        recyclerView.scrollToPosition(product.size()-1);

                        dialog.dismiss();
                    }
                });
                dialog.show();





            }
        });




















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


         adaptor = new RecyclerProductAdaptor(this, product);
        recyclerView.setAdapter(adaptor);
    }
}