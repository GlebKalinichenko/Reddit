package com.example.knifestart.domain

/**
 * Created by glebkalinichenko on 19.12.17.
 */
import io.reactivex.Observable
import io.reactivex.Scheduler

/**
 * Abstraction for single unit of work from business logic standpoint. Purpose of this use case
 * is to query for data.
 *
 * @param <R> Data returned to the observer.
</R> */
abstract class NoArgQueryUseCase<R>(private val mWorkScheduler: Scheduler, private val mObserveScheduler: Scheduler) {

    fun run(): Observable<R> {
        return buildUseCaseObservable()
                .subscribeOn(mWorkScheduler)
                .observeOn(mObserveScheduler)
    }

    protected abstract fun buildUseCaseObservable(): Observable<R>

}
