package com.gusi.kotlin.entities

class Hello (new_hello: String){
    var hello: String = new_hello
        get () = field
        set(value) {
            field = value
        }
}
