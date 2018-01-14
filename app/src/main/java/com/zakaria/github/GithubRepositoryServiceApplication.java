package com.zakaria.github;

import android.app.Application;

import com.zakaria.github.dagger.component.Appcomponent;
import com.zakaria.github.dagger.module.AppModule;

/**
 * Created by Zakaria on 14/01/2018.
 */

public class GithubRepositoryServiceApplication extends Application {
public static Appcomponent appcomponent;
    @Override
    public void onCreate() {
        super.onCreate();

        appcomponent=Appcomponent.Initializer.init(new AppModule(this));
        appcomponent.inject(this);
    }

    public static Appcomponent getAppcomponent() {
        return appcomponent;
    }
}
