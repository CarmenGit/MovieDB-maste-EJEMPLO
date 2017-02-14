package com.evrencoskun.moviedb;

import com.evrencoskun.moviedb.details.DetailsComponent;
import com.evrencoskun.moviedb.details.DetailsModule;
import com.evrencoskun.moviedb.favorites.FavoritesModule;
import com.evrencoskun.moviedb.listing.ListingComponent;
import com.evrencoskun.moviedb.listing.ListingModule;
import com.evrencoskun.moviedb.network.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author evrencoskun
 */
@Singleton
@Component(modules = {AppModule.class, NetworkModule.class, FavoritesModule.class})
public interface AppComponent {
    DetailsComponent plus(DetailsModule detailsModule);

    ListingComponent plus(ListingModule listingModule);
}
