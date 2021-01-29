package com.ymy.firefly.utils

object Tool {

    fun sqlLike(name:String):String{
        return if (name.isNullOrEmpty()) name else "%${name}%"
    }
}
