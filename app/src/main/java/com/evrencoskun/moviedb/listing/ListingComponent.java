package com.evrencoskun.moviedb.listing;

import com.evrencoskun.moviedb.listing.sorting.SortingDialogFragment;
import com.evrencoskun.moviedb.listing.sorting.SortingModule;

import dagger.Subcomponent;

/**
 * @author evrencoskun
 */
@ListingScope
@Subcomponent(modules = {ListingModule.class, SortingModule.class})
public interface ListingComponent {
    MoviesListingFragment inject(MoviesListingFragment fragment);

    SortingDialogFragment inject(SortingDialogFragment fragment);
}
