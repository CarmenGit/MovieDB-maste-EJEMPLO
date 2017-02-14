package com.evrencoskun.moviedb.details;


import com.evrencoskun.moviedb.favorites.IFavoritesInteractor;
import com.evrencoskun.moviedb.network.RequestHandler;

import dagger.Module;
import dagger.Provides;

/**
 * @author evrencoskun
 */
@Module
public class DetailsModule {
    @Provides
    @DetailsScope
    IMovieDetailsInteractor provideInteractor(RequestHandler requestHandler) {
        return new MovieDetailsInteractor(requestHandler);
    }

    @Provides
    @DetailsScope
    IMovieDetailsPresenter providePresenter(IMovieDetailsInteractor detailsInteractor,
                                            IFavoritesInteractor favoritesInteractor) {
        return new MovieDetailsPresenter(detailsInteractor, favoritesInteractor);
    }
}
