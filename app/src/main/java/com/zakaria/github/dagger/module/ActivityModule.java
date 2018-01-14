package com.zakaria.github.dagger.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.zakaria.github.dagger.ActivityScope;
import com.zakaria.github.dagger.Qualifiers;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Zakaria on 14/01/2018.
 */
@Module
public class ActivityModule {
    private AppCompatActivity activity;
    @Provides
    @Qualifiers.forActivity
    @ActivityScope
    Context provideActivityContext() {
        return activity;
    }
}
