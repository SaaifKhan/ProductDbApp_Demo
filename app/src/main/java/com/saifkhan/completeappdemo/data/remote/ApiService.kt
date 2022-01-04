package com.saifkhan.completeappdemo.data.remote

import com.saifkhan.completeappdemo.constants.NetworkCallEndPoints
import com.saifkhan.completeappdemo.data.models.ProductModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {


    @GET(NetworkCallEndPoints.API_GET_ALL_PRODUCTS)
    suspend fun getProducts(): Response<List<ProductModel>>
}