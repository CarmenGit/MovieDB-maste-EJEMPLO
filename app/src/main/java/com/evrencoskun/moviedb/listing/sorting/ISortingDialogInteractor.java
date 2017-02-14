package com.evrencoskun.moviedb.listing.sorting;

/**
 * @author evrencoskun
 */
public interface ISortingDialogInteractor {
    int getSelectedSortingOption();

    void setSortingOption(SortType sortType);
}
