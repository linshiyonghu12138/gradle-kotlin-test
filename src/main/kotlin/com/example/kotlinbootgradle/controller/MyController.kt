package com.example.kotlinbootgradle.controller

import com.example.kotlinbootgradle.service.IMyService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class MyController {

    @Autowired
    private lateinit var myService: IMyService

    @GetMapping("/ping/{source}")
    fun ping(@PathVariable source: String): Result<String> {
        return Result.success(myService.test(source))
    }

}
