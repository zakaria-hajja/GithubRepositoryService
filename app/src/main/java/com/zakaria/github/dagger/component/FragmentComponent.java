package com.zakaria.github.dagger.component;

import android.content.Context;

import com.zakaria.github.dagger.FragmentScope;
import com.zakaria.github.dagger.Qualifiers;
import com.zakaria.github.dagger.module.FragmentModule;
import com.zakaria.github.ui.fragment.RepositoryFragment;
import com.zakaria.github.viewmodel.RepositoryViewModel;

import dagger.Provides;
import dagger.Subcomponent;

/**
 * Created by Zakaria on 14/01/2018.
 */
@FragmentScope
@Subcomponent(modules = FragmentModule.class)
public interface FragmentComponent {
    void inject (RepositoryFragment fragment);

}
