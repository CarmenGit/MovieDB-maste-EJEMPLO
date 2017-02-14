package com.evrencoskun.moviedb.listing;

import com.evrencoskun.moviedb.model.Movie;
import com.evrencoskun.moviedb.util.RxUtils;

import java.util.List;

import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.schedulers.Schedulers;

/**
 * @author evrencoskun
 */
public class MoviesListingPresenter implements IMoviesListingPresenter {
    private IMoviesListingView view;
    private IMoviesListingInteractor moviesInteractor;
    private Subscription fetchSubscription;

    public MoviesListingPresenter(IMoviesListingInteractor interactor) {
        moviesInteractor = interactor;
    }

    @Override
    public void setView(IMoviesListingView view) {
        this.view = view;
    }

    @Override
    public void destroy() {
        view = null;
        RxUtils.unsubscribe(fetchSubscription);
    }

    @Override
    public void displayMovies() {
        fetchSubscription = moviesInteractor.fetchMovies().subscribeOn(Schedulers.io()).observeOn
                (AndroidSchedulers.mainThread()).doOnSubscribe(new Action0() {
            @Override
            public void call() {
                if (isViewAttached()) {
                    view.loadingStarted();
                }
            }
        }).subscribe(new Subscriber<List<Movie>>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                view.loadingFailed(e.getMessage());
            }

            @Override
            public void onNext(List<Movie> movies) {
                view.showMovies(movies);
            }
        });
    }

    private boolean isViewAttached() {
        return view != null;
    }
}

