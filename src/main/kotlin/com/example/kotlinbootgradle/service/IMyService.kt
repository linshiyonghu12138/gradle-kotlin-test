package com.example.kotlinbootgradle.service

import org.springframework.stereotype.Service

interface IMyService {

    fun test(source: String): String
}

@Service
class MyServiceImpl: IMyService {

    override fun test(source: String): String {

        return "result is $source"
    }
}

