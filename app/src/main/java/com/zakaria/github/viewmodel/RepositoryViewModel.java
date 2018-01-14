package com.zakaria.github.viewmodel;

import android.content.Context;

import com.zakaria.github.model.Repository;
import com.zakaria.github.service.RepositoryService;

import java.util.List;

import rx.Observable;

/**
 * Created by Zakaria on 14/01/2018.
 */

public class RepositoryViewModel {
    Context context;
    RepositoryService service;

    public RepositoryViewModel(Context context,RepositoryService service) {
        this.context = context;
        this.service = service;
    }

    public Observable<List<Repository>> getRepositories(int page){
        return service.getRepositories(page);

    }
}
