package com.evrencoskun.moviedb.listing;

import com.evrencoskun.moviedb.model.Movie;

import java.util.List;

import rx.Observable;

/**
 * @author evrencoskun
 */
public interface IMoviesListingInteractor {
    Observable<List<Movie>> fetchMovies();
}
