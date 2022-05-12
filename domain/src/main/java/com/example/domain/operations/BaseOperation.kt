package com.example.domain.operations

interface BaseOperation {
    fun run()
}

interface OperationWithResult<T> {
    fun run(): T
}