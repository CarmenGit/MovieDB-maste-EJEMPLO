package com.evrencoskun.moviedb;

import android.app.Application;
import android.os.StrictMode;

import com.evrencoskun.moviedb.details.DetailsComponent;
import com.evrencoskun.moviedb.details.DetailsModule;
import com.evrencoskun.moviedb.favorites.FavoritesModule;
import com.evrencoskun.moviedb.listing.ListingComponent;
import com.evrencoskun.moviedb.listing.ListingModule;
import com.evrencoskun.moviedb.network.NetworkModule;

/**
 * @author evrencoskun
 */
public class BaseApplication extends Application {
    private AppComponent appComponent;
    private DetailsComponent detailsComponent;
    private ListingComponent listingComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        StrictMode.enableDefaults();
        appComponent = createAppComponent();
    }

    private AppComponent createAppComponent() {
        return DaggerAppComponent.builder().appModule(new AppModule(this)).networkModule(new
                NetworkModule()).favoritesModule(new FavoritesModule()).build();
    }

    public DetailsComponent createDetailsComponent() {
        detailsComponent = appComponent.plus(new DetailsModule());
        return detailsComponent;
    }

    public void releaseDetailsComponent() {
        detailsComponent = null;
    }

    public ListingComponent createListingComponent() {
        listingComponent = appComponent.plus(new ListingModule());
        return listingComponent;
    }

    public void releaseListingComponent() {
        listingComponent = null;
    }

    public ListingComponent getListingComponent() {
        return listingComponent;
    }
}

