package com.n1x0nj4.data

import io.reactivex.Single
import com.n1x0nj4.data.api.ApiService
import com.n1x0nj4.data.model.RestaurantResponse
import com.n1x0nj4.data.repository.RestaurantsRemote
import javax.inject.Inject

class RestaurantsRemoteImpl @Inject constructor(private val apiService: ApiService): RestaurantsRemote {

    override fun getRestaurants(): Single<List<RestaurantResponse>> {
        return apiService.getRestaurants()
    }
}