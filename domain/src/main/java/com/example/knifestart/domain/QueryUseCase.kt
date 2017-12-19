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
 * @param <T> Parameters needed to perform the unit of work.
</T></R> */
abstract class QueryUseCase<R, T> protected constructor(private val mWorkScheduler: Scheduler, private val mObserveScheduler: Scheduler) {

    fun run(params: T): Observable<R> {
        return buildUseCaseObservable(params)
                .subscribeOn(mWorkScheduler)
                .observeOn(mObserveScheduler)
    }

    protected abstract fun buildUseCaseObservable(params: T): Observable<R>


}