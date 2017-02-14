package com.evrencoskun.moviedb;

/**
 * @author evrencoskun
 */
public class Api {
    public static final String API_KEY = "9dc4bca87508f043d71ca734d8ebaa80"; // add your API key
    // here
    public static final String GET_POPULAR_MOVIES = "http://api.themoviedb" +
            ".org/3/discover/movie?language=en&sort_by=popularity.desc&api_key=" + API_KEY;
    public static final String GET_HIGHEST_RATED_MOVIES = "http://api.themoviedb" +
            ".org/3/discover/movie?vote_count.gte=500&language=en&sort_by=vote_average" +
            ".desc&api_key=" + API_KEY;
    public static final String GET_TRAILERS = "http://api.themoviedb" +
            ".org/3/movie/%s/videos?api_key=" + API_KEY;
    public static final String GET_REVIEWS = "http://api.themoviedb" +
            ".org/3/movie/%s/reviews?api_key=" + API_KEY;
    public static final String POSTER_PATH = "http://image.tmdb.org/t/p/w342";
    public static final String BACKDROP_PATH = "http://image.tmdb.org/t/p/w780";
    public static final String YOUTUBE_VIDEO_URL = "http://www.youtube.com/watch?v=%1$s";
    public static final String YOUTUBE_THUMBNAIL_URL = "http://img.youtube.com/vi/%1$s/0.jpg";
}
