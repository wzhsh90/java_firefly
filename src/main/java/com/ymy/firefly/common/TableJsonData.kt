package com.ymy.firefly.common


@KotlinNoArg
class TableJsonData<T> {
    var code: Int = 0
    var page: Int = 0
    var pages: Int = 0
    var records: Int = 0

    @JvmField
    @Transient
    var pageIndex: Int = 0
    var pageSize: Int = 0
    var rows: List<T>? = null

    /**
     * 组装分页信息，返回查询开始临界值
     *
     * @param pageNo
     * @param pageSize
     * @param records
     * @return pageIndex
     */
    fun buildPageInfo(pageNo: Int, pageSize: Int, records: Int) {
        this.page = Math.max(pageNo, 1)
        if (pageSize == -1) {
            this.pageSize = records
            this.pages = 1
        } else {
            this.pageSize = pageSize
            this.pages = (records + pageSize - 1) / pageSize
            if (pageSize >= 2 && records <= pageSize * (pageNo - 1)) {
                this.page = this.pages
            }
        }
        this.page = Math.max(this.page, 1)
        val pageIndex = (this.page - 1) * this.pageSize
        this.records = records
        this.pageIndex = pageIndex
    }
}
