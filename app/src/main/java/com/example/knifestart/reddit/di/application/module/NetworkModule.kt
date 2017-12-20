package com.example.glebkalinichenko.bouncefire.di.application

import com.example.knifestart.domain.IRemoteApi
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Converter
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

/**
 * Created by glebkalinichenko on 16.12.17.
 */
@Module
class NetworkModule {

    @Provides @Singleton
    fun provideClient(networkTimeoutSecond: Long, logger: HttpLoggingInterceptor): OkHttpClient {

        val okHttpClientBuilder: OkHttpClient.Builder = OkHttpClient.Builder()
        okHttpClientBuilder.readTimeout(networkTimeoutSecond, TimeUnit.SECONDS)
        okHttpClientBuilder.connectTimeout(networkTimeoutSecond, TimeUnit.SECONDS)


        logger.level = HttpLoggingInterceptor.Level.BODY
        okHttpClientBuilder.addInterceptor(logger)

        return okHttpClientBuilder.build()

    }

    @Provides @Singleton
    fun provideRetrofit(httpClient: OkHttpClient, baseUrl: String, converter: Converter.Factory): Retrofit =
            Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(converter).client(httpClient).build()

    @Provides @Singleton
    fun provideService(retrofit: Retrofit): IRemoteApi = retrofit.create(IRemoteApi::class.java)
}