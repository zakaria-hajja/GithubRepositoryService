package com.zakaria.github.service.retrofit.entities;

import com.zakaria.github.model.Repository;

import java.util.List;

import rx.Observable;

/**
 * Created by Zakaria on 14/01/2018.
 */

public class RepositoryMapper {
    public static List<Repository> toListRepositories(RepositoryResponse response){
        return response.getRepositories();

    }
}
