package com.zakaria.github.viewmodel;

import android.app.Activity;
import android.content.Context;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.zakaria.github.model.Repository;
import com.zakaria.github.service.RepositoryService;
import com.zakaria.github.utils.Utils;

import java.util.List;

import rx.Observable;

/**
 * Created by Zakaria on 14/01/2018.
 */

public class RepositoryViewModel {
    private Context context;
    private RepositoryService service;
    private Utils utils;

    public RepositoryViewModel(Context context, RepositoryService service, Utils utils) {
        this.context = context;
        this.service = service;
        this.utils = utils;
    }

    public Observable<List<Repository>> getRepositories(int page){
        return service.getRepositories(page);

    }
    public boolean isConnected(){
        return utils.isConnected();
    }
}
