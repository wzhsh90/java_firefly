package com.ymy.firefly.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class LoginViewController {

    @GetMapping("/")
    fun index() = "login"

    @GetMapping("/login")
    fun login() = "login"
}
