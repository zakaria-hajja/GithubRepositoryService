package com.zakaria.github.model;

import java.io.Serializable;

/**
 * Created by Zakaria on 14/01/2018.
 */

public class Owner implements Serializable{
    
    private String name;
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
