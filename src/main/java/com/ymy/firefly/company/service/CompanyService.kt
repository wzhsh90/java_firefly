package com.ymy.firefly.company.service

import com.ymy.firefly.common.TableJsonData
import com.ymy.firefly.company.entity.CompanyEntity

interface CompanyService {

    fun list(name: String, pageIndex: Int, pageSize: Int): TableJsonData<CompanyEntity>
}
