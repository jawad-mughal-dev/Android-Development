package com.example.astore;

public class productModel {

    int image;
    String name , price , discountPrice;
    float ratingStar;

    public productModel(int image, String name, String price, String discountPrice, float ratingStar) {
        this.image = image;
        this.name = name;
        this.price = price;
        this.discountPrice = discountPrice;
        this.ratingStar = ratingStar;
    }

    public productModel(String name, String price , int image) {
        this.name = name;
        this.price = price;
        this.image = image;
    }
}
