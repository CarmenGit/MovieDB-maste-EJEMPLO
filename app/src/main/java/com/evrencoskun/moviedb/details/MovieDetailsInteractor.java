package com.evrencoskun.moviedb.details;

import com.evrencoskun.moviedb.Api;
import com.evrencoskun.moviedb.model.Review;
import com.evrencoskun.moviedb.model.Video;
import com.evrencoskun.moviedb.network.RequestGenerator;
import com.evrencoskun.moviedb.network.RequestHandler;
import com.squareup.okhttp.Request;

import org.json.JSONException;

import java.io.IOException;
import java.util.List;

import rx.Observable;
import rx.functions.Func0;

/**
 * @author evrencoskun
 */
public class MovieDetailsInteractor implements IMovieDetailsInteractor {
    private RequestHandler requestHandler;

    public MovieDetailsInteractor(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    @Override
    public Observable<List<Video>> getTrailers(final String id) {
        return Observable.defer(new Func0<Observable<List<Video>>>() {
            @Override
            public Observable<List<Video>> call() {
                try {
                    return Observable.just(get(id));
                } catch (Exception e) {
                    return Observable.error(e);
                }
            }

            private List<Video> get(String id) throws IOException, JSONException {
                String url = String.format(Api.GET_TRAILERS, id);
                Request request = RequestGenerator.get(url);
                String body = requestHandler.request(request);
                return MovieDetailsParser.parseTrailers(body);
            }
        });
    }

    @Override
    public Observable<List<Review>> getReviews(final String id) {
        return Observable.defer(new Func0<Observable<List<Review>>>() {
            @Override
            public Observable<List<Review>> call() {
                try {
                    return Observable.just(get(id));
                } catch (Exception e) {
                    return Observable.error(e);
                }
            }

            private List<Review> get(String id) throws IOException, JSONException {
                String url = String.format(Api.GET_REVIEWS, id);
                Request request = RequestGenerator.get(url);
                String body = requestHandler.request(request);
                return MovieDetailsParser.parseReviews(body);
            }
        });
    }
}
