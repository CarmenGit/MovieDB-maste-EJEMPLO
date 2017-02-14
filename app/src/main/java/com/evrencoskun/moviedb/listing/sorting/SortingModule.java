package com.evrencoskun.moviedb.listing.sorting;

import dagger.Module;
import dagger.Provides;

/**
 * @author evrencoskun
 */
@Module
public class SortingModule {
    @Provides
    ISortingDialogInteractor providesSortingDialogInteractor(SortingOptionStore store) {
        return new SortingDialogInteractor(store);
    }

    @Provides
    ISortingDialogPresenter providePresenter(ISortingDialogInteractor interactor) {
        return new SortingDialogPresenter(interactor);
    }
}
