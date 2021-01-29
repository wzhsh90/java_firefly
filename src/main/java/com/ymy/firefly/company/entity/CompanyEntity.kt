package com.ymy.firefly.company.entity

import com.ymy.firefly.common.KotlinNoArg
import org.apache.ibatis.type.Alias

@KotlinNoArg
@Alias("CompanyEntity")
data class CompanyEntity(
        var id: String,
        var comName: String,
        var comDesc: String
)
