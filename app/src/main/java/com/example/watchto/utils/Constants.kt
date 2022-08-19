package com.example.watchto.utils

class Constants {
    companion object{
        const val BASE_URL = "https://imdb-api.com/en/API/"
        const val API_KEY = "pk_m82ko7lxapnemm6jm"
        const val TOP_250_MOVIES = "Top250Movies"
        const val TOP_250_SHOW = "Top250TVs"
        const val MOST_POPULAR_MOVIES = "MostPopularMovies"
        const val MOST_POPULAR_SHOWS = "MostPopularTVs"
        const val LINEARLAYOUT = "Linear Layout"
        const val GRIDLAYOUT = "Grid Layout"
    }
}
enum class NetworkState {
    NO_NETWORK,
    NETWORK_LIVE
}