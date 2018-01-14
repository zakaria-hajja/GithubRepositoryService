package com.zakaria.github.dagger.module;

import android.content.Context;

import com.zakaria.github.GithubRepositoryServiceApplication;
import com.zakaria.github.dagger.Qualifiers;

import javax.inject.Qualifier;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

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

}
