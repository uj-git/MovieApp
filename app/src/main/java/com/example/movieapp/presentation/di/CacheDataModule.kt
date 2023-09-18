package com.example.movieapp.presentation.di

import com.example.movieapp.data.datasource.MovieCacheDataSource
import com.example.movieapp.data.datasourceimpl.MovieCacheDataSourceImpl
import com.example.movieapp.data.datasourceimpl.MovieLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {

    @Singleton
    @Provides
    fun provideMovieCacheDataSource():MovieCacheDataSource{
        return MovieCacheDataSourceImpl()
    }
}