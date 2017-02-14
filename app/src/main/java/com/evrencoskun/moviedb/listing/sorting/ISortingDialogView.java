package com.evrencoskun.moviedb.listing.sorting;

/**
 * @author arun
 */
public interface ISortingDialogView {
    void setPopularChecked();

    void setHighestRatedChecked();

    void setFavoritesChecked();

    void dismissDialog();

}
