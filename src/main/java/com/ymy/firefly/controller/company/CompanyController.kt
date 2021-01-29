package com.ymy.firefly.controller.company

import com.ymy.firefly.company.service.CompanyService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class CompanyController(val companyService: CompanyService) {

    @PostMapping("list")
    fun list(name: String?,
             @RequestParam("pageIndex") pageIndex: Int,
             @RequestParam("pageSize") pageSize: Int) = companyService.list(name.orEmpty(), pageIndex, pageSize)
}
