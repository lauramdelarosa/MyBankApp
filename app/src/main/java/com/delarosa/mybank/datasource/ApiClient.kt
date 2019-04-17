package com.delarosa.mybank.datasource


import com.delarosa.mybank.model.*
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface ApiClient {
    /*@GET("/api/1.0/transaction/getLast/{limit}/{customerId}/{productNumber}/get")
    fun getLastTransactionsAsync(
        @Path("limit") limit: Int,
        @Path("customerId") customerId: String,
        @Path("productNumber") productNumber: String
    ):
            Deferred<Response<List<TransactionList>>>*/

    /*@GET("/api/1.0/product/{customerId}/get")
    fun getCustomerProductsAsync(@Path("customerId") customerId: Int): Deferred<Response<Product>>
*/

    //signUp
    @POST("/api/1.0/customer/sign-up")
    fun signUpAsync(
        @Body customer: Customer
    ): Deferred<Response<Unit>>


    //save transaction
    @POST("/api/1.0/transaction/save")
    fun saveTransactionAsync(
        @Header("Authorization") token: String,
        @Body transaction: Transaction
    ): Deferred<Response<Unit>>

    //login
    @POST("/login")
    fun logInAsync(
        @Body customerLogin: CustomerLogin
    ): Deferred<Response<String>>

    //get list of transaction
    //estas son de prueba con Mockoon
    @GET("/api/1.0/transaction/getLast/get")
    fun getLastTransactionsAsync(

    ): Deferred<Response<List<TransactionList>>>

    //getbalance
    //estas son de prueba con Mockoon
    @GET("/api/1.0/product/get")
    fun getCustomerProductsAsync(): Deferred<Response<Product>>

}