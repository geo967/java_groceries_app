package com.example.dailygroceries.Model;

public class Category {
    Integer id;
    String imageurl;

    public Integer getId() {
        return id;
    }

    public Category(Integer id, String imageurl) {
        this.id = id;
        this.imageurl = imageurl;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }
}
