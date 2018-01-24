package com.tianyejia.projectmodel;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by xiaojiang on 2018/1/24.
 */

@Module
public abstract class ActivityBindingModule {

    @ActivityScope
    @ContributesAndroidInjector()
    abstract ScrollingActivity scrollingActivity();


}
