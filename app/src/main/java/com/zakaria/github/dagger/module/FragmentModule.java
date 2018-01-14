package com.zakaria.github.dagger.module;

import android.content.Context;

import com.zakaria.github.dagger.Qualifiers;
import com.zakaria.github.viewmodel.RepositoryViewModel;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Zakaria on 14/01/2018.
 */

@Module
public class FragmentModule {

    @Provides
    RepositoryViewModel providesRepositoryViewModel(@Qualifiers.forActivity Context context){
        return new RepositoryViewModel(context);
    }
}
