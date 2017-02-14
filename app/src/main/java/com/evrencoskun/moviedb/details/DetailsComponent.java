package com.evrencoskun.moviedb.details;

import dagger.Subcomponent;

/**
 * @author evrencoskun
 */
@DetailsScope
@Subcomponent(modules = {DetailsModule.class})
public interface DetailsComponent {
    void inject(MovieDetailsFragment target);
}
