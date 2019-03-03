package com.example.shs.farmer;

public class Items {
    private String farmerid;
    private String categoryid;
    private String item;
    private String quantity;
    private String price;

    public String getFarmerid() {
        return farmerid;
    }

    public void setFarmerid(String farmerid) {
        this.farmerid = farmerid;
    }

    public String getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Items(String farmerid, String categoryid, String item, String quantity, String price) {
        this.farmerid = farmerid;
        this.categoryid = categoryid;
        this.item = item;
        this.quantity = quantity;
        this.price = price;
    }
}
