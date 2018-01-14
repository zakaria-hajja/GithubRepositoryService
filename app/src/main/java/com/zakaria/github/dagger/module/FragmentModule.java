package com.zakaria.github.dagger.module;

import android.content.Context;

import com.zakaria.github.dagger.Qualifiers;
import com.zakaria.github.service.RepositoryService;
import com.zakaria.github.utils.Utils;
import com.zakaria.github.viewmodel.RepositoryViewModel;

import dagger.Module;
import dagger.Provides;
import okhttp3.internal.Util;

/**
 * Created by Zakaria on 14/01/2018.
 */

@Module
public class FragmentModule {

    @Provides
    RepositoryViewModel providesRepositoryViewModel(@Qualifiers.forActivity Context context, RepositoryService service, Utils utils){
        return new RepositoryViewModel(context,service,utils);
    }
}
