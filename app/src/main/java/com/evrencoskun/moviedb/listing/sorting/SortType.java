package com.evrencoskun.moviedb.listing.sorting;

/**
 * @author evrencoskun
 */
public enum SortType {
    MOST_POPULAR(0), HIGHEST_RATED(1), FAVORITES(2);

    private final int value;

    SortType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
