package com.tianyejia.projectmodel;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by xiaojiang on 2018/1/23.
 */
@Singleton
@Component(modules = {
        ApplicationModule.class,
        AndroidSupportInjectionModule.class,
        ActivityBindingModule.class
})
public interface AppComponent extends AndroidInjector<App> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<App>{}
}
