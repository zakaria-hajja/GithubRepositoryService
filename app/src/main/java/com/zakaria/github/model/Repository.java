package com.zakaria.github.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Zakaria on 14/01/2018.
 */

public class Repository implements Serializable {
    @SerializedName("name")
    private String name;
    @SerializedName("description")
    private String description;
    @SerializedName("owner")
    private Owner owner;
    @SerializedName("stargazers_count")
    private Integer nbStars;


    public Repository() {
    }

    public Repository(String name, String description, Owner owner,int nbStars) {
        this.name = name;
        this.description = description;
        this.owner = owner;
        this.nbStars = nbStars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Integer getNbStars() {
        return nbStars;
    }

    public void setNbStars(Integer nbStars) {
        this.nbStars = nbStars;
    }
}
