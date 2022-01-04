package com.saifkhan.completeappdemo.data.remote.repository

import com.saifkhan.completeappdemo.data.remote.ApiService

class MainRepository(
    private val apiService: ApiService,
) {
    suspend fun getProducts() = apiService.getProducts()
}