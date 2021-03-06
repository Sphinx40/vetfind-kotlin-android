package com.egorov.vetfind.data

import com.egorov.vetfind.data.network.VetfindApi
import com.egorov.vetfind.model.Company
import com.egorov.vetfind.model.CompanyProduct
import retrofit2.Response
import javax.inject.Inject

class OrganizationsRemoteDataSource @Inject constructor(
    private val vetfindApi: VetfindApi
) {

    suspend fun fetchOrganization(companyId: Long): Response<List<CompanyProduct>> {
        return vetfindApi.fetchOrganization(companyId)
    }

    suspend fun fetchOrganizations(): Response<List<Company>> {
        return vetfindApi.fetchOrganizations()
    }

    suspend fun fetchProducts(
        shortName: String,
        sortBy: String,
        latitude: String,
        longitude: String,
        isOpenNow: Boolean
    ): Response<List<CompanyProduct>> {
        return vetfindApi.fetchProducts(shortName, sortBy, latitude, longitude, isOpenNow)
    }

}