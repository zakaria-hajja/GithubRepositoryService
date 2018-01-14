package com.zakaria.github.service.retrofit.entities;

import com.google.gson.annotations.SerializedName;
import com.zakaria.github.model.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Zakaria on 14/01/2018.
 */

public class RepositoryResponse implements Serializable{
    @SerializedName("items")
    private List<Repository> repositories;

    public List<Repository> getRepositories() {
        return repositories;
    }

    public void setRepositories(List<Repository> repositories) {
        this.repositories = repositories;
    }
}
