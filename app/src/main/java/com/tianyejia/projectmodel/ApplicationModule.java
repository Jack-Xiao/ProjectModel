package com.tianyejia.projectmodel;

import android.content.Context;

import dagger.Binds;
import dagger.Module;

/**
 * Created by xiaojiang on 2018/1/24.
 */

@Module
public abstract class ApplicationModule {

    @Binds
    abstract Context bindContext(App app);
}
