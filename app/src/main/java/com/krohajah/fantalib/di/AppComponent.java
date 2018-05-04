package com.krohajah.fantalib.di;

import com.krohajah.api.ApiModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Di приложения.
 *
 * @author Maxim Berezin
 */
@Singleton
@Component(modules = {AppModule.class, ApiModule.class})
public interface AppComponent {
}
