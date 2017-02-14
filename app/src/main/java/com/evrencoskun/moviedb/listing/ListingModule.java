package com.evrencoskun.moviedb.listing;

import com.evrencoskun.moviedb.favorites.IFavoritesInteractor;
import com.evrencoskun.moviedb.listing.sorting.SortingOptionStore;
import com.evrencoskun.moviedb.network.RequestHandler;

import dagger.Module;
import dagger.Provides;

/**
 * @author evrencoskun
 */
@Module
public class ListingModule {
    @Provides
    IMoviesListingInteractor provideMovieListingInteractor(IFavoritesInteractor
                                                                   favoritesInteractor,
                                                           RequestHandler requestHandler,
                                                           SortingOptionStore sortingOptionStore) {
        return new MoviesListingInteractor(favoritesInteractor, requestHandler, sortingOptionStore);
    }

    @Provides
    IMoviesListingPresenter provideMovieListingPresenter(IMoviesListingInteractor interactor) {
        return new MoviesListingPresenter(interactor);
    }
}
