package com.evrencoskun.moviedb.favorites;


import com.evrencoskun.moviedb.AppModule;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author evrencoskun
 */
@Module(includes = AppModule.class)
public class FavoritesModule {
    @Provides
    @Singleton
    IFavoritesInteractor provideFavouritesInteractor(FavoritesStore store) {
        return new FavoritesInteractor(store);
    }
}
