package com.evrencoskun.moviedb.listing;

/**
 * @author evrencoskun
 */
public interface IMoviesListingPresenter {
    void displayMovies();

    void setView(IMoviesListingView view);

    void destroy();
}
