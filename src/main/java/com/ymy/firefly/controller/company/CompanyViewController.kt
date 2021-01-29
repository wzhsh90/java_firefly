package com.ymy.firefly.controller.company

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class CompanyViewController {

    private val folder = "company"


    @GetMapping("index")
    fun index() = "${folder}/index"
}
