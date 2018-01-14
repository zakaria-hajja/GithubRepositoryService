package com.zakaria.github.dagger.component;

import com.zakaria.github.dagger.ActivityScope;
import com.zakaria.github.dagger.module.ActivityModule;
import com.zakaria.github.ui.activity.RepositoryActivity;

import dagger.Subcomponent;

/**
 * Created by Zakaria on 14/01/2018.
 */
@Subcomponent(modules = ActivityModule.class)
@ActivityScope
public interface ActivityComponent {
    FragmentComponent plusFragmentComponent();

    void inject(RepositoryActivity repositoryActivity);

}
