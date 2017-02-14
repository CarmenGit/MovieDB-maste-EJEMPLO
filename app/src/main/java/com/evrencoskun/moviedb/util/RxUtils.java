package com.evrencoskun.moviedb.util;

import rx.Subscription;

/**
 * @author evrencoskun
 */
public class RxUtils {
    public static void unsubscribe(Subscription subscription) {
        if (subscription != null) {
            if (!subscription.isUnsubscribed()) {
                subscription.unsubscribe();
            } else {
                // Already unsubscribed
            }
        } else {
            // Subscription doesn't exist
        }
    }

    public static void unsubscribe(Subscription... subscriptions) {
        for (Subscription subscription : subscriptions) {
            if (subscription != null) {
                if (!subscription.isUnsubscribed()) {
                    subscription.unsubscribe();
                } else {
                    // Already unsubscribed
                }
            } else {
                // Subscription doesn't exist
            }
        }
    }
}
