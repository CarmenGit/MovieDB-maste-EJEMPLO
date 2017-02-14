package com.evrencoskun.moviedb.listing;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * @author evrencoskun
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface ListingScope {}
