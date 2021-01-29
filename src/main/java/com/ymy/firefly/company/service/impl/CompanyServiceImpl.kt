package com.ymy.firefly.company.service.impl

import com.ymy.firefly.common.TableJsonData
import com.ymy.firefly.company.entity.CompanyEntity
import com.ymy.firefly.company.mapper.CompanyMapper
import com.ymy.firefly.company.service.CompanyService
import com.ymy.firefly.utils.Tool
import org.springframework.stereotype.Service

@Service
class CompanyServiceImpl(val mapper: CompanyMapper) : CompanyService {

    override fun list(name: String, pageIndex: Int, pageSize: Int): TableJsonData<CompanyEntity> {

        val realName = Tool.sqlLike(name)
        val records = mapper.listCount(realName)
        val tableJsonData = TableJsonData<CompanyEntity>()
        tableJsonData.buildPageInfo(pageIndex, pageSize, records)
        val list = mapper.list(realName, tableJsonData.pageIndex, tableJsonData.pageSize)
        tableJsonData.rows = list
        return tableJsonData

    }
}
