package com.ymy.firefly.company.mapper

import com.ymy.firefly.company.entity.CompanyEntity
import org.apache.ibatis.annotations.Mapper

@Mapper
interface CompanyMapper {

    
    fun listCount(name: String): Int
    fun list(name: String, pageIndex: Int, pageSize: Int): List<CompanyEntity>

}
