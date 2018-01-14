package com.zakaria.github.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Zakaria on 14/01/2018.
 */

public class Owner implements Serializable{
    @SerializedName("login")
    private String name;
    @SerializedName("avatar_url")
    private String image;

    public Owner() {
    }

    public Owner(String name, String image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
