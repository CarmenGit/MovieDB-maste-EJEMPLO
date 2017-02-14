package com.evrencoskun.moviedb.details;


import com.evrencoskun.moviedb.model.Review;
import com.evrencoskun.moviedb.model.Video;

import java.util.List;

import rx.Observable;

/**
 * @author evrencoskun
 */
public interface IMovieDetailsInteractor {
    Observable<List<Video>> getTrailers(String id);

    Observable<List<Review>> getReviews(String id);
}
