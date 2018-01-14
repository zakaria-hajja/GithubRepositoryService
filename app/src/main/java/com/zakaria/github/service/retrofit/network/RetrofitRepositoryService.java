package com.zakaria.github.service.retrofit.network;

import com.zakaria.github.service.retrofit.entities.RepositoryResponse;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Zakaria on 14/01/2018.
 */

public interface RetrofitRepositoryService {
    public static final String ENDPOINT = "https://api.github.com";

    @GET("/search/repositories?sort=stars&order=desc")
    Observable<RepositoryResponse> getRepositories(@Query("q") String created,@Query("page") int page);
}
