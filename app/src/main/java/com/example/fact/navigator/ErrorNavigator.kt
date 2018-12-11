package com.example.fact.navigator


/**
 * Created by Lalit Khandelwal on 11, December, 2018.
 * lalitkhandelwal99@gmail.com
 */
interface ErrorNavigator {
    /**
     * This will call when server will return error with error code
     * @param statusCode Error code
     * @param errorMessage Request eror
     */
    fun onUnknownErrorCode(statusCode: Int, errorMessage: String)

    /**
     * This will call when parsing or other error
     */
    fun onUnknownError(errorMessage: String)

    /**
     * This will call when request time out
     */
    fun onTimeout()

    /**
     * This will call when request failed due to internet connection problem
     */
    fun onNetworkError()
}