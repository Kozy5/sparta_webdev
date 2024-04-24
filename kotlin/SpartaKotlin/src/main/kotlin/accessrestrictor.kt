package org.example

fun main(args: Array<String>) {
    var accessTest = accessTest()
    accessTest.a = 2
    println(accessTest.a)
    accessTest.b = 10
    println(accessTest.b)
//    accessTest.c = 20

}

class accessTest() {
    var a = 1
    public var b = 2
    private var c = 3

    init {
        println(c)
    }

    fun defalutfun() {
        println("im'a defalut")
    }

    public fun publicfun() {
        println("im'a public")
    }

    private fun privatefun() {
        println("in a private")
    }
}