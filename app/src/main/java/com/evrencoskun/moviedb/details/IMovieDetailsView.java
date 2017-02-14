package com.evrencoskun.moviedb.details;


import com.evrencoskun.moviedb.model.Movie;
import com.evrencoskun.moviedb.model.Review;
import com.evrencoskun.moviedb.model.Video;

import java.util.List;

/**
 * @author evrencoskun
 */
public interface IMovieDetailsView {
    void showDetails(Movie movie);

    void showTrailers(List<Video> trailers);

    void showReviews(List<Review> reviews);

    void showFavorited();

    void showUnFavorited();
}
