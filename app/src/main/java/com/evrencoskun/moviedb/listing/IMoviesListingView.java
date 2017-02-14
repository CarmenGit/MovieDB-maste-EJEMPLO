package com.evrencoskun.moviedb.listing;

import com.evrencoskun.moviedb.model.Movie;

import java.util.List;

/**
 * @author evrencoskun
 */
public interface IMoviesListingView {
    void showMovies(List<Movie> movies);

    void loadingStarted();

    void loadingFailed(String errorMessage);

    void onMovieClicked(Movie movie);
}
