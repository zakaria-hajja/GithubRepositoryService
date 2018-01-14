package com.zakaria.github.dagger.module;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zakaria.github.GithubRepositoryServiceApplication;
import com.zakaria.github.dagger.Qualifiers;
import com.zakaria.github.service.RepositoryService;
import com.zakaria.github.service.RepositoryWebService;
import com.zakaria.github.service.retrofit.network.RetrofitRepositoryService;
import com.zakaria.github.utils.Utils;

import javax.inject.Qualifier;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Zakaria on 14/01/2018.
 */
@Singleton
@Module
public class AppModule {
    private GithubRepositoryServiceApplication application;

    public AppModule(GithubRepositoryServiceApplication application) {
        this.application = application;
    }
    @Singleton
    @Provides
    @Qualifiers.forApplication
    Context providesApplicationContext(){
        return this.application;
    }

    @Singleton
    @Provides
    RepositoryService providesRepositoryService(RetrofitRepositoryService service,Utils utils){
        return new RepositoryWebService(service,utils);
    }
    @Singleton
    @Provides
    RetrofitRepositoryService providesRetrofitRepositoryService(Retrofit retrofit){
        return retrofit.create(RetrofitRepositoryService.class);
    }



    @Singleton
    @Provides
    Retrofit providesRetrofit(){
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        return new Retrofit.Builder()
                .baseUrl(RetrofitRepositoryService.ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }

    @Singleton
    @Provides
    Utils providesUtils(@Qualifiers.forApplication Context context){
        return new Utils(context);
    }

}
