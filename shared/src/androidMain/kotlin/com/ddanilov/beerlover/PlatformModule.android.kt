package com.ddanilov.beerlover

import com.danilov.network.httpEngine
import com.ddanilov.beerlover.breweries.CategoriesListViewModel
import org.koin.dsl.module

actual fun platformModule() = module {
    single { httpEngine }
    single {
        CategoriesListViewModel(get())
    }
}
