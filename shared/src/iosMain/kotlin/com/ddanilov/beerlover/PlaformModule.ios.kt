package com.ddanilov.beerlover

import com.danilov.network.httpEngine
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module

actual fun platformModule() = module {
    single { httpEngine }
}
