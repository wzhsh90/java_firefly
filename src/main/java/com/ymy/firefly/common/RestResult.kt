package com.ymy.firefly.common


class RestResult<T> {
    var code = 0;
    var message = "success";
    var result: T? = null;
}
