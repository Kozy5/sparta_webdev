package org.example

fun main(args: Array<String>) {
    //    {a:Int,b:Int -> a*b } 람다 표현식만 쓸때는 매개변수에 타입 명시
    //    var multifly:(Int,Int)->Int  = {a,b -> a*b}
    var multifly:(Int,Int)->Int = {a,b -> a*b}
    println(multifly(2,3)) // 6
}