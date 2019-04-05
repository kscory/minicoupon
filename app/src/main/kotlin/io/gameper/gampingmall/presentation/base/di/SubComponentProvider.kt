package io.gameper.gampingmall.presentation.base.di

/**
 * Created by lev.novikov
 * Date: 2/12/17.
 */

interface SubComponentProvider {
    fun <C : ComponentBuilder> provide(key: Class<C>): ComponentBuilder
}
