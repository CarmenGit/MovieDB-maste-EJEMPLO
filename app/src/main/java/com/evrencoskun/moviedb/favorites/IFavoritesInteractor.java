package com.evrencoskun.moviedb.favorites;


import com.evrencoskun.moviedb.model.Movie;

import java.util.List;

/**
 * @author evrencoskun
 */
public interface IFavoritesInteractor {
    void setFavorite(Movie movie);

    boolean isFavorite(String id);

    List<Movie> getFavorites();

    void unFavorite(String id);
}
