package com.example.view_appgiaohang.fragments;

public class history_history {
    private int image;
    private String boba;
    private String add;
    private String price;
    private String date;

    public history_history(int image, String boba, String add, String price, String date) {
        this.image = image;
        this.boba = boba;
        this.add = add;
        this.price = price;
        this.date = date;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getBoba() {
        return boba;
    }

    public void setBoba(String boba) {
        this.boba = boba;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
