package com.ymy.firefly.common

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.servlet.resource.ResourceUrlProvider


//freemarker 得到静态资源
@ControllerAdvice("com.ymy.firefly")
class ResourceUrlAdvice @Autowired constructor(val resourceUrlProvider: ResourceUrlProvider) {

    @ModelAttribute("urls")
    fun urls(): ResourceUrlProvider {
        return this.resourceUrlProvider
    }

}
