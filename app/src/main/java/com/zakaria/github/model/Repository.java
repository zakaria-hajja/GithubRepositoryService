package com.zakaria.github.model;

import java.io.Serializable;

/**
 * Created by Zakaria on 14/01/2018.
 */

public class Repository implements Serializable {

    private String name;
    private String description;
    private Owner owner;

    public Repository() {
    }

    public Repository(String name, String description, Owner owner) {
        this.name = name;
        this.description = description;
        this.owner = owner;
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
}
