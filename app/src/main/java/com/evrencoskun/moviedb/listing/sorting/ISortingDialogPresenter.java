package com.evrencoskun.moviedb.listing.sorting;

/**
 * @author evrencoskun
 */
public interface ISortingDialogPresenter {
    void setLastSavedOption();

    void onPopularMoviesSelected();

    void onHighestRatedMoviesSelected();

    void onFavoritesSelected();

    void setView(ISortingDialogView view);

    void destroy();
}
