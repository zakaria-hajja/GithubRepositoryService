package com.zakaria.github.service;

import android.util.Log;

import com.zakaria.github.model.Repository;
import com.zakaria.github.service.retrofit.entities.RepositoryMapper;
import com.zakaria.github.service.retrofit.entities.RepositoryResponse;
import com.zakaria.github.service.retrofit.network.RetrofitRepositoryService;
import com.zakaria.github.utils.Utils;

import java.util.List;

import rx.Observable;
import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by Zakaria on 14/01/2018.
 */

public class RepositoryWebService implements RepositoryService {
    private RetrofitRepositoryService service;
    private Utils utils;

    public RepositoryWebService(RetrofitRepositoryService service,Utils utils) {
        this.service = service;
        this.utils = utils;
    }

    @Override
    public Observable<List<Repository>> getRepositories(int page) {

        String q = "created:>";
        q+=utils.getLast30Day();


        return service.getRepositories(q,page)
                .map(new Func1<RepositoryResponse, List<Repository>>() {
                    @Override
                    public List<Repository> call(RepositoryResponse response) {
                        return RepositoryMapper.toListRepositories(response);
                    }
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

}
