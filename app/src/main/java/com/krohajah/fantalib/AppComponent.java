package com.krohajah.fantalib;

import android.app.Application;

import com.krohajah.fantalib.data.ApiModule;
import com.krohajah.fantalib.data.fantlib.repository.AuthorsRepository;
import com.krohajah.fantalib.data.fantlib.repository.AuthorsRepositoryModule;
import com.krohajah.fantalib.data.fantlib.source.remote.FantLibApiWorker;
import com.krohajah.fantalib.di.ActivityBindingModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Di приложения.
 *
 * @author Maxim Berezin
 */
@Singleton
@Component(modules = {AppModule.class,
        ApiModule.class,
        AuthorsRepositoryModule.class,
        ActivityBindingModule.class,
        AndroidSupportInjectionModule.class
})
public interface AppComponent extends AndroidInjector<App> {

    AuthorsRepository authorsRepository();

    FantLibApiWorker fantLibApiWorker();

    @Component.Builder
    interface Builder {

        @BindsInstance
        AppComponent.Builder application(Application application);

        AppComponent build();
    }
}
