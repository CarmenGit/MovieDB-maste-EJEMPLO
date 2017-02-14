package com.evrencoskun.moviedb.details;


import com.evrencoskun.moviedb.model.Movie;

/**
 * @author evrencoskun
 */
public interface IMovieDetailsPresenter {
    void showDetails(Movie movie);

    void showTrailers(Movie movie);

    void showReviews(Movie movie);

    void showFavoriteButton(Movie movie);

    void onFavoriteClick(Movie movie);

    void setView(IMovieDetailsView view);

    void destroy();
}
