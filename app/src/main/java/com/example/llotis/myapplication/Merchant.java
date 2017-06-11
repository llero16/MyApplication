package com.example.llotis.myapplication;

/**
 * Created by llotis on 10/5/2017.
 */

public class Merchant {

    private String id;
    private String legalName;
    private String category;
    private String address;
    private String imageUrl;
    private String review;

    //...
    //Άρες
    /*public Merchant(String id, String legalName, String category, String address, String imageUrl, String review)
    {
        this.id = id;
        this.legalName = legalName;
        this.category = category;
        this.address = address;
        this.imageUrl = imageUrl;
        this.review = review;
    }*/
    //...

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLegalName(){
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }
}