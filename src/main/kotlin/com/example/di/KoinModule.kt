package com.example.di

import com.example.repo.MoviesRepository
import com.example.controllers.MoviesController
import org.koin.dsl.module

val koinModule = module {
    single<MoviesRepository> {
        MoviesController()
    }
}