package com.example.astore;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerProductAdaptor extends RecyclerView.Adapter<RecyclerProductAdaptor.ViewHolder> {

    Context context;
    ArrayList <productModel> product;
    RecyclerProductAdaptor(Context context , ArrayList <productModel> product)
    {
        this.context = context;
        this.product = product;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(context).inflate(R.layout.productdesign , parent, false);
       ViewHolder viewHolder = new ViewHolder(view);
       return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.ivProductImg.setImageResource(product.get(position).image);
        holder.tvProductName.setText(product.get(position).name);
        holder.tvProductCurrentPrice.setText(product.get(position).price);
        holder.tvProductSalePrice.setText(product.get(position).discountPrice);
        holder.rbProductRating.setRating(product.get(position).ratingStar);

    }

    @Override
    public int getItemCount() {
        return product.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvProductName , tvProductCurrentPrice , tvProductSalePrice;
        ImageView ivProductImg;
        RatingBar rbProductRating;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvProductName = itemView.findViewById(R.id.tvProductName);
            tvProductCurrentPrice = itemView.findViewById(R.id.tvProductCurrentPrice);
            tvProductSalePrice = itemView.findViewById(R.id.tvProductSalePrice);
            tvProductSalePrice.setPaintFlags(tvProductSalePrice.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

            ivProductImg = itemView.findViewById(R.id.ivProductImg);
            rbProductRating = itemView.findViewById(R.id.rbProductRating);


        }


    }

}
