package com.zakaria.github.dagger.component;


import com.zakaria.github.GithubRepositoryServiceApplication;
import com.zakaria.github.dagger.module.ActivityModule;
import com.zakaria.github.dagger.module.AppModule;

import dagger.Component;

/**
 * Created by Zakaria on 14/01/2018.
 */
@Component(modules = AppModule.class)
public interface Appcomponent {
    ActivityComponent plusActivityComponent(ActivityModule activityModule);
    void inject(GithubRepositoryServiceApplication application);
    final class Initializer {

        private Initializer() {
            //empty
        }

        public static synchronized Appcomponent init(AppModule appModule) {
            return DaggerAppcomponent.builder()
                    .appModule(appModule)
                    .build();
        }
    }
}
